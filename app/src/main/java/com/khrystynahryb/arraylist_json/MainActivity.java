package com.khrystynahryb.arraylist_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends JsonService {
    ListView listView;
    ArrayList<ItemDoctorModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        array();
        arrayList = getDoctorsList();

        AdapterDoctor adapter = new AdapterDoctor(this, arrayList);
        listView.setAdapter(adapter);
    }

    private void init(){
        listView = findViewById(R.id.list_view);
    }
}
