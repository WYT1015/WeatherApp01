package com.example.weatherappl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weatherappl.util.CityTest;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LitePal.getDatabase();

        getSupportActionBar().hide();

        CityTest.getProvince();
       /* CityTest.getCity(28);
        CityTest.getCounty(28,270);
*/
    }
}