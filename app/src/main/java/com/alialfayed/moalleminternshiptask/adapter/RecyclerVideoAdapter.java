package com.alialfayed.moalleminternshiptask.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alialfayed.moalleminternshiptask.R;
import com.alialfayed.moalleminternshiptask.model.VideoModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : RecyclerView Adapter Video
 * Date 6/12/2020 - 4:15 PM
 */
public class RecyclerVideoAdapter extends RecyclerView.Adapter<RecyclerVideoAdapter.RecyclerViewHolder> {

    private final OnClickItem onClickItem;
    private ArrayList<VideoModel> videoModels;

    public RecyclerVideoAdapter(OnClickItem onClickItem, ArrayList<VideoModel> videoModels) {
        this.onClickItem = onClickItem;
        this.videoModels = videoModels;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_vp, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {

        final VideoModel videoModel = videoModels.get(position);

        holder.imgVideo.setImageResource(videoModel.getThumbnail());

        holder.imgPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickItem.onVideoClick(videoModel);
            }
        });

    }

    @Override
    public int getItemCount() {
        return videoModels != null ? videoModels.size() : 0;
    }

    static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgPlayer;
        private ImageView imgVideo;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPlayer = itemView.findViewById(R.id.imgPlayer_itemVideo_Recycler);
            imgVideo = itemView.findViewById(R.id.imgVideo_itemVideo_Recycler);
        }
    }
}
