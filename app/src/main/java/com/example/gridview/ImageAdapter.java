package com.example.gridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {

    List<Integer> imagesList = new ArrayList<Integer>();

    public ImageAdapter(List<Integer> imagesList) {
        this.imagesList = imagesList;
    }

    @Override
    public int getCount() {
        return imagesList.size();
    }

    @Override
    public Object getItem(int position) {
        return imagesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            ImageView imageViewItem = new ImageView(parent.getContext());
            imageViewItem.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageViewItem.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, 120));
            imageViewItem.setImageResource(imagesList.get(position));
            convertView = imageViewItem;
        }
        return convertView;
    }
}
