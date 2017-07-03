package com.hasom.examabstractfactory3.BestBoard;


import android.util.Log;

import com.hasom.examabstractfactory3.abst.ListModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class BestListModel implements ListModel {
    @Override
    public String getList() {
        Log.e("", "BestListModel getList");

        return "BestListModel";
    }
}
