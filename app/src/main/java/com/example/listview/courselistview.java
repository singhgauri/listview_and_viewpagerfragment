package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.ListView;

public class courselistview extends Activity {
    // Array of strings...
    String[] Courses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselistview);
         Courses = getResources().getStringArray(R.array.courses);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview1, Courses);

        ListView listView = (ListView) findViewById(R.id.menulist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Mad.class);
                    // sending data to new activity
                    startActivityForResult(intent, 0);
                } else {
                    Intent intent = new Intent(view.getContext(), csa.class);
                    // sending data to new activity
                    startActivityForResult(intent, 0);
                }

            }
        });

    }
}














