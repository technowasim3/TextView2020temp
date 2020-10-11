package com.example.android.textview2020temp;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView1,textView2;
    ImageButton imageButton;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.image_circle);
        textView1=(TextView)itemView.findViewById(R.id.text1);
        textView2=(TextView)itemView.findViewById(R.id.text2);

    }
}
