package com.project.calendar;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendar);
        textView = findViewById(R.id.textview);

        calendarView.setOnDateChangeListener((calendarView, i, i1, i2) -> {
            String date = i2 + "/" + (i1+1) + "/" + i;
            textView.setText(date);
        });


    }
}