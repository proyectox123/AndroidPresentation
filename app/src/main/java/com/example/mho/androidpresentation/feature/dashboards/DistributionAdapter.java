package com.example.mho.androidpresentation.feature.dashboards;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mho.androidpresentation.BaseRecyclerViewAdapter;
import com.example.mho.androidpresentation.BaseViewHolder;
import com.example.mho.androidpresentation.R;
import com.example.mho.androidpresentation.model.AndroidVersion;

import java.util.ArrayList;

public class DistributionAdapter extends BaseRecyclerViewAdapter<AndroidVersion> {

    private LayoutInflater layoutInflater;

    public DistributionAdapter(Context context, ArrayList<AndroidVersion> items) {
        super(context, items);
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder setViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_dashboard_distribution, parent, false);
        return new DistributionViewHolder(context, v);
    }

    @Override
    public void onBindData(RecyclerView.ViewHolder holder, int position, AndroidVersion androidVersion)
            throws Exception {
        DistributionViewHolder distributionViewHolder = (DistributionViewHolder) holder;
        distributionViewHolder.setDataInViews(holder, position, androidVersion);
    }

    private static class DistributionViewHolder extends BaseViewHolder<AndroidVersion>
            implements View.OnClickListener {

        private TextView distributionCodenameText;
        private TextView distributionAPIText;
        private TextView distributionDistributionText;

        DistributionViewHolder(Context context, View itemView) {
            super(context, itemView);
            distributionCodenameText = itemView.findViewById(R.id.distributionCodenameText);
            distributionAPIText = itemView.findViewById(R.id.distributionAPIText);
            distributionDistributionText = itemView.findViewById(R.id.distributionDistributionText);
        }

        @Override
        public void setDataInViews(RecyclerView.ViewHolder holder, int position,
                                   AndroidVersion androidVersion) {
            distributionCodenameText.setText(androidVersion.getLabel());
            distributionAPIText.setText(androidVersion.getApiLevels());
            distributionDistributionText.setText(androidVersion.getDistribution());
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
