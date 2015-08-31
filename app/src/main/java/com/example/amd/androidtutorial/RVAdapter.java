package com.example.amd.androidtutorial;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by amd on 8/31/15.
 */
public class RVAdapter extends RecyclerView.Adapter <MyViewHolder> {

    private LayoutInflater inflater;
    List<Information> list= Collections.emptyList();

    public RVAdapter( Context context, List<Information> data){
        inflater = LayoutInflater.from(context);
        this.list = data;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.custom_row, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Information current = list.get(i);
        viewHolder.buttonView.setText(current.button);
        viewHolder.titleView.setText(current.title);
        viewHolder.descView.setText(current.desc);

    }

    @Override
    public int getItemCount()  {
        return list.size();
    }

    @Override
    public void onViewRecycled(MyViewHolder holder) {
        super.onViewRecycled(holder);
    }


}


class MyViewHolder extends RecyclerView.ViewHolder {

    TextView buttonView, titleView, descView;
    public MyViewHolder(View itemView) {
        super(itemView);
        buttonView = (TextView) itemView.findViewById(R.id.buttonId);
        titleView = (TextView) itemView.findViewById(R.id.titleId);
        descView = (TextView) itemView.findViewById(R.id.descriptionId);
    }
}