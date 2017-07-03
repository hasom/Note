package com.hasom.examabstractfactory2.linux;

import com.hasom.examabstractfactory2.abst.Button;
import com.hasom.examabstractfactory2.abst.GuiFactory;
import com.hasom.examabstractfactory2.abst.TextArea;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class LinuxGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTetArea() {
        return new LinuxTextArea();
    }
}
