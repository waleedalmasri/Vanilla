package com.example.vanilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItemsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.items_re);
        String[] names = new String[Items.items.length];
        int[] imageIDs = new int[Items.items.length];


        for (int i = 0; i < names.length; i++) {
            names[i] = Items.items[i].getName();
            imageIDs[i] = Items.items[i].getImageId();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(names, imageIDs);
        recyclerView.setAdapter(itemAdapter);
    }

    public void btnDetailsOnClick(View view) {

        int id = view.getId();
        String name = "";
        String type = "";
        String flavor = "";
        String price = "";
        Boolean isAvailable = false;
        int imageId = 0;
        for (int i = 0; i < Items.items.length; i++) {
            if (id == Items.items[i].getImageId()) {
                name = Items.items[i].getName();
                type = Items.items[i].getType();
                flavor = Items.items[i].getFlavor();
                price = String.valueOf(Items.items[i].getPrice());
                isAvailable = Items.items[i].isAvailable();
                imageId = Items.items[i].getImageId();
            }
        }
        Intent intent = new Intent(getApplicationContext(), Details.class);
        intent.putExtra("name", name);
        intent.putExtra("flavor", flavor);
        intent.putExtra("type", type);
        intent.putExtra("isAvailable", isAvailable);
        intent.putExtra("price", price);
        intent.putExtra("id", imageId);
        startActivity(intent);

    }
}