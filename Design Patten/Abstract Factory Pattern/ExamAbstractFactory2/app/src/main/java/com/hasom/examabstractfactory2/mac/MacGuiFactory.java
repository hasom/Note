package com.hasom.examabstractfactory2.mac;

import com.hasom.examabstractfactory2.abst.Button;
import com.hasom.examabstractfactory2.abst.GuiFactory;
import com.hasom.examabstractfactory2.abst.TextArea;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class MacGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTetArea() {
        return new MacTextArea();
    }
}
