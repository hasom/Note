package com.hasom.examabstractfactory3.abst;

/**
 * Created by leejunho on 2017. 7. 3..
 */

public interface Board {


    public ListModel createListModel();
    public WriteModel createWriteModel();
}
