package com.example.mho.androidpresentation.feature.history.view;

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
import com.example.mho.androidpresentation.model.AndroidVersion;
import com.example.mho.androidpresentation.util.ImageUtils;

import java.util.ArrayList;

public class HistoryAdapter extends BaseRecyclerViewAdapter<AndroidVersion> {

    private LayoutInflater layoutInflater;

    public HistoryAdapter(Context context, ArrayList<AndroidVersion> items) {
        super(context, items);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(context, v);
    }

    @Override
    public void onBindData(RecyclerView.ViewHolder holder, int position, AndroidVersion androidVersion)
            throws Exception {
        HistoryViewHolder historyViewHolder = (HistoryViewHolder) holder;
        historyViewHolder.setDataInViews(holder, position, androidVersion);
    }

    private static class HistoryViewHolder extends BaseViewHolder<AndroidVersion>
            implements View.OnClickListener {

        private ImageView historyItemImage;
        private TextView historyItemText;
        private TextView historyItemApiText;

        HistoryViewHolder(Context context, View itemView) {
            super(context, itemView);
            historyItemImage = itemView.findViewById(R.id.historyItemImage);
            historyItemText = itemView.findViewById(R.id.historyItemText);
            historyItemApiText = itemView.findViewById(R.id.historyItemApiText);
        }

        @Override
        public void setDataInViews(RecyclerView.ViewHolder holder, int position,
                                   AndroidVersion androidVersion) {
            historyItemText.setText(androidVersion.getLabel());
            historyItemApiText.setText(androidVersion.getApiLevels());
            historyItemImage.setOnClickListener(this);

            ImageUtils.loadUrl(context, historyItemImage, androidVersion.getUrlImage());
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.historyItemImage:
                    break;
            }
        }
    }
}
