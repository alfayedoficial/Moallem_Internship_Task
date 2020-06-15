package com.alialfayed.moalleminternshiptask.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.alialfayed.moalleminternshiptask.R;
import com.alialfayed.moalleminternshiptask.model.VideoModel;
import com.alialfayed.moalleminternshiptask.uilts.Constant;

public class VideoPlayerActivity extends AppCompatActivity {

    @BindView(R.id.imgVideo_VideoPlayer)
    ImageView imgVideoVideoPlayer;
    @BindView(R.id.imgPlayerBar_VideoPlayer)
    ImageView imgPlayerBarVideoPlayer;
    @BindView(R.id.txtTitle_VideoPlayer)
    TextView txtTitleVideoPlayer;
    @BindView(R.id.txtDescription_VideoPlayer)
    TextView txtDescriptionVideoPlayer;
    @BindView(R.id.static_page)
    ConstraintLayout staticPage;
    @BindView(R.id.videoView)
    VideoView videoView;
    private String video_url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        // Inflate ButterKnife Library
        ButterKnife.bind(this);

        // Check if videoModel is null of no
        Intent intent = getIntent();
        VideoModel videoModel = (VideoModel) intent.getSerializableExtra(Constant.VIDEO_MODEL);
        if(videoModel != null){
            imgVideoVideoPlayer.setImageResource(videoModel.getThumbnail());
            txtTitleVideoPlayer.setText(videoModel.getNameVideo());
            txtDescriptionVideoPlayer.setText(videoModel.getDescriptionVideo());
            video_url = "android.resource://" + getPackageName() + "/" + videoModel.getLinkVideo();

            imgPlayerBarVideoPlayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    staticPage.setVisibility(View.GONE);
                    videoView.setVisibility(View.VISIBLE);
                    playVideo();
                }
            });
        }else {
            imgVideoVideoPlayer.setVisibility(View.GONE);
            txtTitleVideoPlayer.setText(getText(R.string.error_message));
            txtDescriptionVideoPlayer.setVisibility(View.GONE);
            imgPlayerBarVideoPlayer.setVisibility(View.GONE);
        }

    }

    /**
     * method create video request
     */
    private void playVideo(){
        Uri videoUri = Uri.parse(video_url);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videoUri);
        videoView.requestFocus();
        videoView.start();
    }
}