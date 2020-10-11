package com.example.android.textview2020temp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler View & Card View");
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       adapter = new myadapter(dataquoue());
       recyclerView.setAdapter(adapter);
    }

    public ArrayList<Model> dataquoue(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1=new Model();
        obj1.setHeader("Safdar");
        obj1.setDesc("I.G Colony,Kulti");
        obj1.setImagename(R.drawable.ic_baseline_account_circle_24);
        holder.add(obj1);

        Model obj2=new Model();
        obj1.setHeader("");
        obj1.setDesc("I.G Colony,Kulti");
        obj1.setImagename(R.drawable.ic_baseline_account_circle_24);
        holder.add(obj2);
        return holder;

    }
}