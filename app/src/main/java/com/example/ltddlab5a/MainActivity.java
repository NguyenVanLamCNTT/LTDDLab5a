package com.example.ltddlab5a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFood;
    CustomFoodAdapter adt;
    ArrayList<Food> arrayList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);

        arrayList = new ArrayList<Food>();
        arrayList.add(new Food("Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.donut_yellow_1));
        arrayList.add(new Food("Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.tasty_donut));

        adt = new CustomFoodAdapter(this, R.layout.item_list_view, arrayList);
        lvFood.setAdapter(adt);
        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, MainDetailActivity.class);
                i.putExtra("name",arrayList.get(position).getName());
                i.putExtra("detail", arrayList.get(position).getDetail());
                startActivity(i);
            }
        });
    }
}
