package com.example.easylearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  class food_Adapter extends RecyclerView.Adapter<food_Adapter.MyViewHolder> {

    private Context context;
    private ArrayList<FoodModel> arrayList;
    private  final RecyclerviewInterface recyclerviewInterface;

    food_Adapter(Context context, ArrayList<FoodModel> arrayList, RecyclerviewInterface  recyclerviewInterface)
    {
        this.context=context;
        this.arrayList=arrayList;
        this.recyclerviewInterface=recyclerviewInterface;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_food_item_row,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view,recyclerviewInterface);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).foodImage);
        holder.foodName.setText(arrayList.get(position).foodName.toString());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView foodName;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView,RecyclerviewInterface recyclerviewInterface) {
            super(itemView);
            foodName=itemView.findViewById(R.id.foodName);

            imageView = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,arrayList.get(getAdapterPosition()).foodName.toString(),Toast.LENGTH_SHORT).show();

                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerviewInterface != null)
                    {
                        int pos=getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION)
                        {
                            recyclerviewInterface.onItemClick(pos);
                        }
                    }
                }
            });


        }
    }
}