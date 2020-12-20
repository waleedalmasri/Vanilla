package com.example.vanilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    TextView name, price, type, flavor, isAvailable;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name = findViewById(R.id.name);
        flavor = findViewById(R.id.flavor);
        type = findViewById(R.id.type);
        price = findViewById(R.id.price);
        isAvailable = findViewById(R.id.available);
        image = findViewById(R.id.img);
        Intent intent=getIntent();



        String name=intent.getStringExtra("name");
        String type=intent.getStringExtra("type");
        String flavor=intent.getStringExtra("flavor");
        String price=intent.getStringExtra("price");
        boolean isAvailable=intent.getBooleanExtra("isAvailable",false);
        int imageId=intent.getIntExtra("id",0);
        Drawable drawable = ContextCompat.getDrawable(this,imageId);
        this.name.setText("Name: "+name);
        this.flavor.setText("Flavor: "+flavor);
        this.type.setText("Type: "+type);
        this.price.setText("Price: "+price+" NIS");
        if (isAvailable)
            this.isAvailable.setText("Available");
        else
            this.isAvailable.setText("Not Available");

        this.image.setImageDrawable(drawable);

    }

    public void btnAddOnClick(View view) {
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
    }
}