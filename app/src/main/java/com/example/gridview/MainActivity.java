package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> imagesList = new ArrayList<Integer>();
    Toast toast;
    List<String> stringList =
            new ArrayList<String>(Arrays.asList("Gorilla","Panda", "Eagle", "Panther","Polar", "Elephant"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        GridView gridView = findViewById(R.id.girdView);
        gridView.setNumColumns(3);
        final ImageView largeImageView = findViewById(R.id.imageView);
        gridView.setAdapter(new ImageAdapter(imagesList));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                largeImageView.setImageResource(imagesList.get(position));
                if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(MainActivity.this, stringList.get(position), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    public void addData(){
        imagesList.add(R.drawable.eagle);
        imagesList.add(R.drawable.bunnysplash);
        imagesList.add(R.drawable.elephant);
        imagesList.add(R.drawable.gorilla);
        imagesList.add(R.drawable.panda);
        imagesList.add(R.drawable.panther);
    }
}
