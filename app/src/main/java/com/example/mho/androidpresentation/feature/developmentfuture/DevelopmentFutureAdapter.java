package com.example.mho.androidpresentation.feature.developmentfuture;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mho.androidpresentation.BaseRecyclerViewAdapter;
import com.example.mho.androidpresentation.BaseViewHolder;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.model.DevelopmentFuture;
import com.example.mho.androidpresentation.util.ImageUtils;

import java.util.ArrayList;

class DevelopmentFutureAdapter extends BaseRecyclerViewAdapter<DevelopmentFuture> {

    private LayoutInflater layoutInflater;

    DevelopmentFutureAdapter(Context context, ArrayList<DevelopmentFuture> items) {
        super(context, items);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_development_future, parent, false);
        return new DevelopmentFutureViewHolder(context, v);
    }

    @Override
    public void onBindData(RecyclerView.ViewHolder holder, int position,
                           DevelopmentFuture developmentFuture)
            throws Exception {
        DevelopmentFutureViewHolder developmentFutureViewHolder =
                (DevelopmentFutureViewHolder) holder;
        developmentFutureViewHolder.setDataInViews(holder, position, developmentFuture);
    }

    private static class DevelopmentFutureViewHolder extends BaseViewHolder<DevelopmentFuture>
            implements View.OnClickListener {

        private ImageView historyItemImage;
        private TextView developmentFutureItemText;

        DevelopmentFutureViewHolder(Context context, View itemView) {
            super(context, itemView);
            historyItemImage = itemView.findViewById(R.id.historyItemImage);
            developmentFutureItemText = itemView.findViewById(R.id.developmentFutureItemText);

            historyItemImage.setVisibility(View.GONE);
        }

        @Override
        public void setDataInViews(RecyclerView.ViewHolder holder, int position,
                                   DevelopmentFuture developmentFuture) {
            developmentFutureItemText.setText(developmentFuture.getLabel());

            ImageUtils.loadUrl(context, historyItemImage, developmentFuture.getImageUrl());
        }

        @Override
        public void onClick(View v) {

        }
    }
}
