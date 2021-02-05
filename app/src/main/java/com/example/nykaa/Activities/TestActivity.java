package com.example.nykaa.Activities;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.nykaa.Adapters.ItemListAdapter;
import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.Data.listItemsData.ListItemsResponseModel;
import com.example.nykaa.Fragments.ListOfItemsFragment;
import com.example.nykaa.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    private Handler handler;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        handler = new Handler();
        textView = findViewById(R.id.textView);
        Thread thread = new Thread(downloadRunnable);
        thread.start();
    }

    private Runnable downloadRunnable = new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("https://www.nykaafashion.com/catalogsearch/result/?q=bag&searchType=Manual&internalSearchTerm=bag");
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();

                int data = inputStream.read();
                StringBuilder stringBuilder = new StringBuilder();
                while (data != -1) {
                    char ch = (char) data;
                    stringBuilder.append(ch);
                    data = inputStream.read();
                }
                String results = stringBuilder.toString();
                //<script id="__PRELOADED_STATE__" type="application/json">
                //</script>

                String jsonResult="";

                for (int index = results.indexOf("<script id=\"__PRELOADED_STATE__\" type=\"application/json\""); index >= 0; ) {

                    // Start Index
                    int startIndex = results.indexOf(">", index + 1);
                    ++startIndex;

                    // End Index
                    int indexOfEnd = results.indexOf("</script>", startIndex + 1);

                    String attributesString = results.substring(startIndex, indexOfEnd);
                    // Replace below line with desired logic with calling trim() on the String attributesString
                    jsonResult = attributesString;

                    // Next Address will be after the end of first address
                    index = results.indexOf("<address", indexOfEnd + 1);
                }

                String finalJsonResult = jsonResult;
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        buildDataFromJson(finalJsonResult);
                    }
                });

                inputStream.close();

            } catch (IOException e) {
                Toast.makeText(TestActivity.this, "Not working", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    };
    private List<JsonMember1Item> listItemsData;

    private void buildDataFromJson(String json) {
        Type type = new TypeToken<ListItemsResponseModel>() {
        }.getType();
        ListItemsResponseModel response = new Gson().fromJson(json, type);
        listItemsData = response.getListing().getProducts().getJsonMember1();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(response.getListing().getTitle());

            }
        }, 1000);
    }

}