package com.example.nykaa.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nykaa.Data.constants.IntentConstants;
import com.example.nykaa.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        initView();
    }

    private EditText tvSearch;

    private void initView() {
        tvSearch = findViewById(R.id.tvSearch);

        tvSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    sendIntent();
                    return true;
                }
                return false;
            }
        });


    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            sendIntent();
            return true;
        }

        return super.onKeyUp(keyCode, event);

    }

    private void sendIntent() {
        String str = tvSearch.getText().toString();
        if (str.equals("shoes")) {
            Intent intent = new Intent(SearchActivity.this, MainScreenActivity.class);
            intent.putExtra(IntentConstants.SEARCH_STUFF, "shoes.json");
            startActivity(intent);
        }
        if (str.equals("watch")) {
            Intent intent = new Intent(SearchActivity.this, MainScreenActivity.class);
            intent.putExtra(IntentConstants.SEARCH_STUFF, "watches.json");
            startActivity(intent);

        }
        if (str.equals("bags")) {
            Intent intent = new Intent(SearchActivity.this, MainScreenActivity.class);
            intent.putExtra(IntentConstants.SEARCH_STUFF, "bags.json");
            startActivity(intent);
        } else {
            Intent intent = new Intent(SearchActivity.this, MainScreenActivity.class);
            intent.putExtra(IntentConstants.SEARCH_STUFF, str);
            startActivity(intent);
        }
    }
}