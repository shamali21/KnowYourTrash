package com.womxn.hackathon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Popup extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window);
        TextView label = findViewById(R.id.popupText);
        label.setText(getIntent().getExtras().getString("garbageType"));
    }
}

