package com.alialfayed.moalleminternshiptask.adapter;

import com.alialfayed.moalleminternshiptask.model.DataModel;
import com.alialfayed.moalleminternshiptask.model.VideoModel;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : Interface of Onclick
 * Date 6/12/2020 - 4:57 PM
 */
public interface OnClickItem {
    void onItemClick(DataModel dataModels);

    void onVideoClick(VideoModel videoModel);
}
