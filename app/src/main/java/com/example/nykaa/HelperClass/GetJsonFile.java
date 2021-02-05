package com.example.nykaa.HelperClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetJsonFile {
    public static String getItemDetail(String fileName) {

        try {
            URL url = new URL("https://www.nykaafashion.com" + fileName);
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

            String jsonResult = "";

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
            return (jsonResult);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "nan";
    }
}
