package com.example.user.diction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class list_items extends AppCompatActivity {
String name;
String mean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
    }
public list_items()
{
}
    public list_items(String name,String mean) {
        this.name = name;
        this.mean = mean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getName() {
        return name;
    }

    public String getMean() {
        return mean;
    }
}
