package com.alialfayed.moalleminternshiptask.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : DataModel POJO
 * Date 6/12/2020 - 2:18 PM
 */
public class DataModel implements Serializable, Comparable<DataModel> {
    private int image;
    private int selectedImage;
    private String titleCategory;
    private ArrayList<VideoModel> videoModels;

    public DataModel(int image, int selectedImage, String titleCategory) {
        this.image = image;
        this.selectedImage = selectedImage;
        this.titleCategory = titleCategory;
        this.videoModels = new ArrayList<>();
    }

    public int getImage() {
        return image;
    }

    public int getSelectedImage() {
        return selectedImage;
    }

    public String getTitleCategory() {
        return titleCategory;
    }

    public ArrayList<VideoModel> getVideoModels() {
        return videoModels;
    }

    public void setVideoModel(VideoModel videoModel) {
        this.videoModels.add(videoModel);
    }

    @Override
    public int compareTo(DataModel dataModel) {
        if (!this.titleCategory.equals(dataModel.getTitleCategory()))
            return 1;
        return 0;
    }
}
