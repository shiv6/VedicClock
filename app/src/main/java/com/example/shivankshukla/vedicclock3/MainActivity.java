package com.example.shivankshukla.vedicclock3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView t = (TextView)findViewById(R.id.textbox1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String dateTime = DateFormat.getDateTimeInstance().format(new Date());
        //t.setText(dateTime);
    }
}
