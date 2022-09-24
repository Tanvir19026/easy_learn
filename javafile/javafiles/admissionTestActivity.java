package com.example.easylearn;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;


public class admissionTestActivity extends AppCompatActivity implements RecyclerviewInterface {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_test);

        recyclerView = findViewById(R.id.rcv1);

        ArrayList<FoodModel> arrayList = new ArrayList<>();

        arrayList.add(new FoodModel("University Science",  R.drawable.science));
        arrayList.add(new FoodModel("Engineering", R.drawable.enginerring));
        arrayList.add(new FoodModel("Business Studies",  R.drawable.businiess));
        arrayList.add(new FoodModel("D unit/BBA + Private University",  R.drawable.gha));
        arrayList.add(new FoodModel("বিশ্ববিদ্যালয় মানবিক - খ ইউনিট ভর্তি  প্রস্তুতি",  R.drawable.humiti));


        food_Adapter adapter = new food_Adapter(admissionTestActivity.this, arrayList, this);

        /*LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);*/
        // GridLayoutManager gridLayoutManager= new GridLayoutManager(MainActivity.this,2);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);


    }
    @Override
    public void onItemClick(int position) {
        if (position == 0) {
            Intent intent = new Intent(admissionTestActivity.this, admScience.class);
            startActivity(intent);

        }
        else if(position ==1)
        {
            Intent intent = new Intent(admissionTestActivity.this, admEngineering.class);
            startActivity(intent);
        }
        else if(position ==2)
        {
            Intent intent = new Intent(admissionTestActivity.this, admBusiness.class);
            startActivity(intent);
        }
        else if(position ==3)
        {
            Intent intent = new Intent(admissionTestActivity.this, admGha.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(admissionTestActivity.this, admHuminity.class);
            startActivity(intent);
        }
    }



}


