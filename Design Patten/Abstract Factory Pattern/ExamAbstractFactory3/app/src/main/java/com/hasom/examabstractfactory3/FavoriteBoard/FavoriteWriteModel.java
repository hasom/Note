package com.hasom.examabstractfactory3.FavoriteBoard;

import android.util.Log;

import com.hasom.examabstractfactory3.abst.WriteModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class FavoriteWriteModel implements WriteModel {
    @Override
    public String write() {
        Log.d("", "FavoriteWriteModel write");

        return "FavoriteWriteModel";
    }
}
