package com.example.iag19_000.inhershoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class chooseField extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    MyApp application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_field);
        application = ((MyApp) this.getApplication());

        application.dropCount = 0;
        application.currentStatus = "";
        application.droppingNow = false;
        application.sitCount = 0;
        application.field = "";
    }

    /** Called when the user taps the Send button */
    public void fieldAChosen(View view) {
        Intent intent = new Intent(this, result.class);
        application.field = "A";
        application.sitCount=0;
        startActivity(intent);
    }
    public void fieldBChosen(View view) {
        Intent intent = new Intent(this, result.class);
        application.field = "B";
        application.sitCount=0;
        startActivity(intent);
    }
    public void fieldCChosen(View view) {
        Intent intent = new Intent(this, result.class);
        application.field = "C";
        application.sitCount=0;
        startActivity(intent);
    }
    public void fieldDChosen(View view) {
        Intent intent = new Intent(this, result.class);
        application.field = "D";
        application.sitCount=0;
        startActivity(intent);
    }
}
