package com.example.android.textview2020temp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> {
    ArrayList<Model> data;

    public myadapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override

    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.textView1.setText(data.get(position).getHeader());
        holder.textView2.setText(data.get(position).getDesc("Desktop Programming"));
        holder.imageView.setImageResource(data.get(position).getImagename(R.drawable.ic_baseline_account_circle_24));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
