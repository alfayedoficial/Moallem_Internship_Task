package com.alialfayed.moalleminternshiptask.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.alialfayed.moalleminternshiptask.R;
import com.alialfayed.moalleminternshiptask.adapter.OnClickItem;
import com.alialfayed.moalleminternshiptask.adapter.RecyclerCatAdapter;
import com.alialfayed.moalleminternshiptask.adapter.RecyclerVideoAdapter;
import com.alialfayed.moalleminternshiptask.data.Data;
import com.alialfayed.moalleminternshiptask.model.DataModel;
import com.alialfayed.moalleminternshiptask.model.VideoModel;
import com.alialfayed.moalleminternshiptask.uilts.Constant;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnClickItem {

    @BindView(R.id.btnMenu_MainActivity)
    ImageButton btnMenu;
    @BindView(R.id.recyclerCategory_MainActivity)
    RecyclerView rYCategory;
    @BindView(R.id.recyclerVideoPlayer_MainActivity)
    RecyclerView rYVideoPlayer;

    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inflate ButterKnife Library
        ButterKnife.bind(this);

        // Generate Data class and return DataModels POJO
        Data date = new Data();
        date.setDataModels(this);

        ArrayList<DataModel> dataModels = date.getDataModels();

        // inflate Recycler Category and Videos
        setRecyclerCat(dataModels);
        setRecyclerVideo(dataModels.get(0).getVideoModels());

    }

    // Interface OnItemClick
    @Override
    public void onItemClick(DataModel dataModels) {
        setRecyclerVideo(dataModels.getVideoModels());
    }

    // Interface OnVideoClick
    @Override
    public void onVideoClick(VideoModel videoModel) {

        // Start Move Another Activity
        startActivity(moveFromActivityToAnother(this, VideoPlayerActivity.class).putExtra(Constant.VIDEO_MODEL, videoModel));
    }

    /**
     * Method To Inflate Recycler Videos
     *
     * @param videoModel [VideoModel]
     */
    private void setRecyclerVideo(ArrayList<VideoModel> videoModel) {
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerVideoAdapter videoAdapter = new RecyclerVideoAdapter(this, videoModel);
        rYVideoPlayer.setLayoutManager(layoutManager);
        rYVideoPlayer.setHasFixedSize(true);
        rYVideoPlayer.setAdapter(videoAdapter);
    }

    /**
     * Method To Inflate Recycler Category
     *
     * @param dataModels ArrayList of [DataModel]
     */
    private void setRecyclerCat(ArrayList<DataModel> dataModels) {
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerCatAdapter catAdapter = new RecyclerCatAdapter(this, getApplicationContext(), dataModels);
        rYCategory.setLayoutManager(layoutManager);
        rYCategory.setHasFixedSize(true);
        rYCategory.setAdapter(catAdapter);
    }

    /**
     * @param activity this activity you want move
     * @param cls      another activity you want move
     * @return Intent
     */
    public static Intent moveFromActivityToAnother(Activity activity, Class<?> cls) {
        return new Intent(activity, cls);
    }


}
