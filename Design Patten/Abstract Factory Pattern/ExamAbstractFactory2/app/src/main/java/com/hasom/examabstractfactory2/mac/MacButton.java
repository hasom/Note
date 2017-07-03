package com.hasom.examabstractfactory2.mac;

import com.hasom.examabstractfactory2.abst.Button;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}
