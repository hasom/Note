package com.hasom.examabstractfactory2.linux;

import com.hasom.examabstractfactory2.abst.TextArea;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트 필드";
    }
}
