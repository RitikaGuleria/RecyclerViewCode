package com.example.reccylerview_udemy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        //Data source
        DataModel[] myListData=new DataModel[]{
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
                new DataModel("Call me",R.drawable.one),
                new DataModel("Text me",R.drawable.two),
        };

        //Adapter
        MyAdapter adapter=new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}