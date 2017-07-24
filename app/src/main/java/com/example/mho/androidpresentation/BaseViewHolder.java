package com.example.mho.androidpresentation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public Context context;

    public BaseViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;
    }

    public abstract void setDataInViews(RecyclerView.ViewHolder holder, int position, T data);
}