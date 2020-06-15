package com.alialfayed.moalleminternshiptask.model;

import java.io.Serializable;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : VideoModel POJO
 * Date 6/12/2020 - 2:20 PM
 */
public class VideoModel implements Serializable, Comparable<VideoModel> {
    private int thumbnail;
    private String nameVideo;
    private String descriptionVideo;
    private int linkVideo;
    private DataModel dataModel;

    public VideoModel(int thumbnail, String nameVideo, String descriptionVideo, int linkVideo, DataModel dataModel) {
        this.thumbnail = thumbnail;
        this.nameVideo = nameVideo;
        this.descriptionVideo = descriptionVideo;
        this.linkVideo = linkVideo;
        this.dataModel = dataModel;

        dataModel.setVideoModel(this);
    }

    public String getDescriptionVideo() {
        return descriptionVideo;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public int getLinkVideo() {
        return linkVideo;
    }

    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public int compareTo(VideoModel videoModel) {
        if (!this.nameVideo.equals(videoModel.getNameVideo()))
            return 1;
        return this.dataModel.compareTo(videoModel.getDataModel());
    }
}
