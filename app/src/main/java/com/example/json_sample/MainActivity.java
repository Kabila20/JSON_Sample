package com.example.json_sample;

import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.json_sample.R;

public class MainActivity extends Activity {
    public static final String JSON_STRING="{\"Student\":{\"name\":\"kabilan\",\"age\":22}}";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1=(TextView)findViewById(R.id.textview);

        try{
            JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("Student");
            String name=emp.getString("name");
            int age=emp.getInt("age");

            String str=" Name:"+name+"\n"+"Age:"+age;
            textView1.setText(str);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}