package com.hasom.examabstractfactory3.BestBoard;


import com.hasom.examabstractfactory3.abst.Board;
import com.hasom.examabstractfactory3.abst.ListModel;
import com.hasom.examabstractfactory3.abst.WriteModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class BestBoard implements Board {

    @Override
    public ListModel createListModel() {
        return new BestListModel();
    }

    @Override
    public WriteModel createWriteModel() {
        return new BestWriteModel();
    }
}
