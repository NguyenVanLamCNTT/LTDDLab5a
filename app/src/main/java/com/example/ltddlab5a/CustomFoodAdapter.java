package com.example.ltddlab5a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomFoodAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Food> arrayList;

    public CustomFoodAdapter(Context ctx, int layoutItem, ArrayList<Food> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        //Ánh xạ
        TextView tvName = view.findViewById(R.id.nameFood);
        TextView tvDetail = view.findViewById(R.id.detailFood);
        TextView tvPrice = view.findViewById(R.id.priceFood);
        ImageView imageFood = view.findViewById(R.id.imageFood);
        // Get value
        tvName.setText(arrayList.get(i).getName());
        tvDetail.setText(arrayList.get(i).getDetail());
        tvPrice.setText(arrayList.get(i).getPrice());
        imageFood.setImageResource(arrayList.get(i).getImageFood());
        return view;
    }
}
