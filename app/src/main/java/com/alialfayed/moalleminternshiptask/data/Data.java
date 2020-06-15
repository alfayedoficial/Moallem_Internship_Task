package com.alialfayed.moalleminternshiptask.data;

import android.content.Context;

import com.alialfayed.moalleminternshiptask.R;
import com.alialfayed.moalleminternshiptask.model.DataModel;
import com.alialfayed.moalleminternshiptask.model.VideoModel;

import java.util.ArrayList;

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do : Class To insert Data
 * Date 6/12/2020 - 2:49 PM
 */
public class Data {

    private ArrayList<DataModel> dataModels;

    public ArrayList<DataModel> getDataModels() {
        return dataModels;
    }

    /**
     * Method To Insert Data and setData on DataModel and VideoModel
     *
     * @param context context of Activity
     */
    public void setDataModels(Context context) {
        dataModels = new ArrayList<>();
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic1, context.getString(R.string.video_name1), context.getString(R.string.random_description), R.raw.physics1);
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic2, context.getString(R.string.video_name2), context.getString(R.string.random_description), R.raw.physics2);
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic3, context.getString(R.string.video_name3), context.getString(R.string.random_description), R.raw.physics1);
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic4, context.getString(R.string.video_name4), context.getString(R.string.random_description), R.raw.physics2);
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic5, context.getString(R.string.video_name5), context.getString(R.string.random_description), R.raw.physics1);
        insetDataModel(R.drawable.ic_physics, R.drawable.ic_selected_physics, context.getString(R.string.cat_physics), R.drawable.cat_physics_pic6, context.getString(R.string.video_name6), context.getString(R.string.random_description), R.raw.physics2);

        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic1, context.getString(R.string.video_name1), context.getString(R.string.random_description), R.raw.biology1);
        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic2, context.getString(R.string.video_name2), context.getString(R.string.random_description), R.raw.biology2);
        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic3, context.getString(R.string.video_name3), context.getString(R.string.random_description), R.raw.biology1);
        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic4, context.getString(R.string.video_name4), context.getString(R.string.random_description), R.raw.biology2);
        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic5, context.getString(R.string.video_name5), context.getString(R.string.random_description), R.raw.biology1);
        insetDataModel(R.drawable.ic_biology, R.drawable.ic_selected_biology, context.getString(R.string.cat_biology), R.drawable.cat_biology_pic6, context.getString(R.string.video_name6), context.getString(R.string.random_description), R.raw.biology2);

        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic1, context.getString(R.string.video_name1), context.getString(R.string.random_description), R.raw.history1);
        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic2, context.getString(R.string.video_name2), context.getString(R.string.random_description), R.raw.history2);
        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic3, context.getString(R.string.video_name3), context.getString(R.string.random_description), R.raw.history1);
        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic4, context.getString(R.string.video_name4), context.getString(R.string.random_description), R.raw.history2);
        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic5, context.getString(R.string.video_name5), context.getString(R.string.random_description), R.raw.history1);
        insetDataModel(R.drawable.ic_history, R.drawable.ic_selected_history, context.getString(R.string.cat_history), R.drawable.cat_history_pic6, context.getString(R.string.video_name6), context.getString(R.string.random_description), R.raw.history2);

        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic1, context.getString(R.string.video_name1), context.getString(R.string.random_description), R.raw.algebra1);
        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic2, context.getString(R.string.video_name2), context.getString(R.string.random_description), R.raw.algebra2);
        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic3, context.getString(R.string.video_name3), context.getString(R.string.random_description), R.raw.algebra1);
        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic4, context.getString(R.string.video_name4), context.getString(R.string.random_description), R.raw.algebra2);
        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic5, context.getString(R.string.video_name5), context.getString(R.string.random_description), R.raw.algebra1);
        insetDataModel(R.drawable.ic_algebra, R.drawable.ic_selected_algebra, context.getString(R.string.cat_algebra), R.drawable.cat_algebra_pic6, context.getString(R.string.video_name6), context.getString(R.string.random_description), R.raw.algebra2);
    }

    /**
     * setData on DataModel and VideoModel
     *
     * @param icon             icon of Category
     * @param selectedIcon     icon of Category is Selected
     * @param titleCategory    titleCategory
     * @param thumbnail        capture video from screen
     * @param nameVideo        name of video
     * @param descriptionVideo description of video
     * @param uriVideo         uri of video
     */
    private void insetDataModel(int icon, int selectedIcon, String titleCategory, int thumbnail, String nameVideo, String descriptionVideo, int uriVideo) {
        DataModel dataModel = addData(icon, selectedIcon, titleCategory);
        VideoModel videoModel = addVideo(thumbnail, nameVideo, descriptionVideo, uriVideo, dataModel);
    }

    /**
     * method setData on DataModel
     *
     * @param icon          icon of Category
     * @param selectedIcon  icon of Category is Selected
     * @param titleCategory titleCategory
     * @return DataModel
     */
    private DataModel addData(int icon, int selectedIcon, String titleCategory) {
        for (DataModel dataModel : dataModels)
            if (dataModel.getTitleCategory().equals(titleCategory))
                return dataModel;
        DataModel dataModel = new DataModel(icon, selectedIcon, titleCategory);
        dataModels.add(dataModel);
        return dataModel;
    }

    /**
     * method setData on DataModel
     *
     * @param thumbnail        capture video from screen
     * @param nameVideo        name of video
     * @param descriptionVideo description of video
     * @param uriVideo         uriVideo uri of video
     * @param dataModel        DataModel
     * @return videoModel
     */
    private VideoModel addVideo(int thumbnail, String nameVideo, String descriptionVideo, int uriVideo, DataModel dataModel) {
        for (VideoModel videoModel : dataModel.getVideoModels())
            if (videoModel.getNameVideo().equals(nameVideo))
                return videoModel;
        return new VideoModel(thumbnail, nameVideo, descriptionVideo, uriVideo, dataModel);
    }
}
