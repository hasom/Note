package com.hasom.examabstractfactory3.FavoriteBoard;

import com.hasom.examabstractfactory3.abst.Board;
import com.hasom.examabstractfactory3.abst.ListModel;
import com.hasom.examabstractfactory3.abst.WriteModel;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public class FavoriteBoard implements Board {
    @Override
    public ListModel createListModel() {
        return new FavoriteListModel();
    }

    @Override
    public WriteModel createWriteModel() {
        return new FavoriteWriteModel();
    }
}
