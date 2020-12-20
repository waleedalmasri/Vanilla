package com.example.vanilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.team_re);
        String[] names = new String[Student.members.length];
        int[] imageIDs = new int[Student.members.length];


        for (int i = 0; i < names.length; i++) {
            names[i] = Student.members[i].getName();
            imageIDs[i] = Student.members[i].getImageId();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(names, imageIDs);
        recyclerView.setAdapter(itemAdapter);
    }
    public void btnDetailsOnClick(View view) {
        Toast.makeText(this, "أريدي مضغوط يا باشا :(", Toast.LENGTH_SHORT).show();
    }
}