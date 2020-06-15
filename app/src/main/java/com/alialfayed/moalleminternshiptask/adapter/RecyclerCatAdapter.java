package com.alialfayed.moalleminternshiptask.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alialfayed.moalleminternshiptask.R;
import com.alialfayed.moalleminternshiptask.model.DataModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : RecyclerView Adapter Category
 * Date 6/12/2020 - 4:15 PM
 */

public class RecyclerCatAdapter extends RecyclerView.Adapter<RecyclerCatAdapter.RecyclerViewHolder> {

    private final OnClickItem onClickItem;
    private Context context;
    private ArrayList<DataModel> dataModels;
    private int selectedItem;


    public RecyclerCatAdapter(OnClickItem onClickItem, Context context, ArrayList<DataModel> dataModels) {
        this.onClickItem = onClickItem;
        this.context = context;
        this.dataModels = dataModels;
        this.selectedItem = 0;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat_recycler, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, final int position) {

        final DataModel dataModel = dataModels.get(position);

        holder.titleCat.setText(dataModel.getTitleCategory());
        holder.imgIcon.setImageResource(dataModel.getImage());
        holder.card_item.setCardBackgroundColor(context.getResources().getColor(R.color.white));
        holder.titleCat.setTextSize(14);
        holder.titleCat.setTypeface(null, Typeface.NORMAL);

        if (selectedItem == position) {
            holder.titleCat.setTextSize(20);
            holder.titleCat.setTypeface(null, Typeface.BOLD);
            holder.imgIcon.setImageResource(dataModel.getSelectedImage());
            holder.card_item.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickItem.onItemClick(dataModel);
                int previousItem = selectedItem;
                selectedItem = position;

                notifyItemChanged(previousItem);
                notifyItemChanged(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataModels != null ? dataModels.size() : 0;
    }

    static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgIcon;
        private TextView titleCat;
        private View itemView;
        private CardView card_item;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            imgIcon = itemView.findViewById(R.id.imgIcon_itemCat_Vp);
            titleCat = itemView.findViewById(R.id.titleCat_itemCat_Vp);
            card_item = itemView.findViewById(R.id.card_itemCat_Vp);
            this.itemView = itemView;
        }
    }
}
