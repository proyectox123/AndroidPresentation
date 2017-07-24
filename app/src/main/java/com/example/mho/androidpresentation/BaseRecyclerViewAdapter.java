package com.example.mho.androidpresentation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public abstract class BaseRecyclerViewAdapter<T>
        extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public Context context;
    private ArrayList<T> items;
    protected OnRecyclerItemClicked onRecyclerItemClicked;

    public BaseRecyclerViewAdapter(Context context, ArrayList<T> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return setViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        try {
            onBindData(holder, position, getItem(position));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        if(items == null){
            return 0;
        }

        return items.size();
    }

    public abstract RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType);

    public abstract void onBindData(RecyclerView.ViewHolder holder, int position, T val)
            throws Exception;

    public void setOnRecyclerItemClicked(OnRecyclerItemClicked onRecyclerItemClicked){
        this.onRecyclerItemClicked = onRecyclerItemClicked;
    }

    public void setItems(ArrayList<T> savedCardItemz){
        items = savedCardItemz;
        this.notifyDataSetChanged();
    }

    public T getItem(int position){
        if(items == null){
            return null;
        }

        return items.get(position);
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public interface OnRecyclerItemClicked<T> {
        void onItemClicked(int position, T item, @Nullable View... itemView);
    }
}