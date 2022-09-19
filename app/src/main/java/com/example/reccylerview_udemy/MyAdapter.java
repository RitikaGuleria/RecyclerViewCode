package com.example.reccylerview_udemy;

//this class is used for a bridging  between layout (view) and data model class or data source
//(main activity)

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{
    //1) Data Source
    private DataModel[] listData;
    public MyAdapter(DataModel[] listData)
    {
        this.listData=listData;
    }

    //2) View holder
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageViewRecycler);
            this.textView = itemView.findViewById(R.id.textViewRecycler);
        }
    }
    //3) Implementing methods

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View listItem=inflater.inflate(R.layout.item_recycler,parent,false);
        ViewHolder viewHolder=new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        final DataModel myListData=listData[position];
        holder.textView.setText(listData[position].getTitle());
        holder.imageView.setImageResource(listData[position].getImage());

        //HANDLING CLICK EVENTS
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

}
