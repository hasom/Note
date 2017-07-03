package com.hasom.examabstractfactory3.BestBoard;

import android.util.Log;

import com.hasom.examabstractfactory3.abst.WriteModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class BestWriteModel implements WriteModel {
    @Override
    public String write() {
        Log.e("", "BestWriteModel write");

        return "BestWriteModel";
    }
}
