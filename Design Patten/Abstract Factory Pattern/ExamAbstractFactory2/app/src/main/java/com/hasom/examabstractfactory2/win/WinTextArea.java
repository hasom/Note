package com.hasom.examabstractfactory2.win;

import com.hasom.examabstractfactory2.abst.TextArea;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트 필드";
    }
}
