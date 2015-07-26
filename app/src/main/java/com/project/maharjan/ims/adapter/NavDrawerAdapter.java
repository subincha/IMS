package com.project.maharjan.ims.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.maharjan.ims.R;
import com.project.maharjan.ims.entites.NavDrawerEntities;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maharjan on 7/24/2015.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<NavDrawerAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    List<NavDrawerEntities> data = Collections.emptyList();

    public NavDrawerAdapter(Context context, List<NavDrawerEntities> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavDrawerEntities current = data.get(position);
        holder.title.setText(current.getName());
        holder.icon.setImageResource(current.getId());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView title;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvNavRow);
            icon = (ImageView) itemView.findViewById(R.id.ivNavRow);
        }
    }
}
