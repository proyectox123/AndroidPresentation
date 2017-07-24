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
import com.example.mho.androidpresentation.model.HistoryItem;
import com.example.mho.androidpresentation.util.ImageUtils;

import java.util.ArrayList;

/**
 * Created by ironbit on 24-Jul-17.
 * Modified by ironbit on 24-Jul-17.
 */

public class HistoryAdapter extends BaseRecyclerViewAdapter<HistoryItem> {

    private LayoutInflater layoutInflater;

    public HistoryAdapter(Context context, ArrayList<HistoryItem> items) {
        super(context, items);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(context, v);
    }

    @Override
    public void onBindData(RecyclerView.ViewHolder holder, int position, HistoryItem historyItem)
            throws Exception {
        HistoryViewHolder historyViewHolder = (HistoryViewHolder) holder;
        historyViewHolder.setDataInViews(holder, position, historyItem);
    }

    private static class HistoryViewHolder extends BaseViewHolder<HistoryItem>
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
                                   HistoryItem historyItem) {
            historyItemText.setText(historyItem.getLabel());
            historyItemApiText.setText(historyItem.getApiLevels());
            historyItemImage.setOnClickListener(this);

            ImageUtils.loadUrl(context, historyItemImage, historyItem.getUrlImage());
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
