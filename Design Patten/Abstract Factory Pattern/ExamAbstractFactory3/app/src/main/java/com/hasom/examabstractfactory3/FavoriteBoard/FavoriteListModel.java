package com.hasom.examabstractfactory3.FavoriteBoard;

import android.util.Log;

import com.hasom.examabstractfactory3.abst.ListModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class FavoriteListModel implements ListModel {
    @Override
    public String getList() {
        Log.d("", "FavoriteListModel getList");

        return "FavoriteListModel";
    }
}
