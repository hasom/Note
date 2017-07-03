package com.hasom.examabstractfactory2.win;

import com.hasom.examabstractfactory2.abst.Button;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼");
    }
}
