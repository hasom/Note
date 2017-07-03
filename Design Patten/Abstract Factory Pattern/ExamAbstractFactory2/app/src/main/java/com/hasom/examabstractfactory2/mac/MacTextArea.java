package com.hasom.examabstractfactory2.mac;

import com.hasom.examabstractfactory2.abst.TextArea;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트 필드";
    }
}
