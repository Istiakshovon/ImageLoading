package com.istiak.imageloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {



    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Salman_Khan_at_Renault_Star_Guild_Awards.jpg/220px-Salman_Khan_at_Renault_Star_Guild_Awards.jpg")
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(imageView);

    }
}
