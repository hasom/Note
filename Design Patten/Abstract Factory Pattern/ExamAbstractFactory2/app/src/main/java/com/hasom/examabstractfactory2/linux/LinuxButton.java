package com.hasom.examabstractfactory2.linux;

import com.hasom.examabstractfactory2.abst.Button;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
