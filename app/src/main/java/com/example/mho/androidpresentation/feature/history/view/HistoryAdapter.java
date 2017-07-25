package com.example.mho.androidpresentation.feature.history.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
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

import static com.example.mho.androidpresentation.feature.history.view.HistoryDetailActivity.EXTRA_ANDROID_VERSION;

class HistoryAdapter extends BaseRecyclerViewAdapter<AndroidVersion> {

    private LayoutInflater layoutInflater;

    HistoryAdapter(Context context, ArrayList<AndroidVersion> items) {
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
        private AndroidVersion androidVersion;

        HistoryViewHolder(Context context, View itemView) {
            super(context, itemView);
            historyItemImage = itemView.findViewById(R.id.historyItemImage);
            historyItemText = itemView.findViewById(R.id.historyItemText);
        }

        @Override
        public void setDataInViews(RecyclerView.ViewHolder holder, int position,
                                   AndroidVersion androidVersion) {
            this.androidVersion = androidVersion;
            historyItemText.setText(androidVersion.getLabel());
            historyItemImage.setOnClickListener(this);

            ImageUtils.loadUrl(context, historyItemImage, androidVersion.getUrlImage());
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.historyItemImage:
                    initHistoryDetailActivity();
                    break;
            }
        }

        @SuppressWarnings("unchecked")
        private void initHistoryDetailActivity(){
            Intent intent = new Intent(context, HistoryDetailActivity.class);
            intent.putExtra(EXTRA_ANDROID_VERSION, androidVersion);

            Pair<View, String> pair1 =  Pair.create((View) historyItemImage,
                            context.getString(R.string.transition_name_icon));
            Pair<View, String> pair2 =  Pair.create((View) historyItemText,
                    context.getString(R.string.transition_name_title));
            ActivityOptionsCompat options = ActivityOptionsCompat.
                    makeSceneTransitionAnimation((Activity) context, pair1, pair2);

            context.startActivity(intent, options.toBundle());
        }
    }
}
