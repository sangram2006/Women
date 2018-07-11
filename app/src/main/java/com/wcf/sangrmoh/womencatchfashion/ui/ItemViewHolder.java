package com.wcf.sangrmoh.womencatchfashion.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wcf.sangrmoh.womencatchfashion.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView imageNameTextView;
    public TextView Price;
    public TextView Size;

    public ItemViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        imageNameTextView = itemView.findViewById(R.id.ImageNameTextView);
    }
}
