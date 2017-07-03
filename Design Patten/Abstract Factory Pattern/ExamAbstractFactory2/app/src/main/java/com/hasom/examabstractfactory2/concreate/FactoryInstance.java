package com.hasom.examabstractfactory2.concreate;

import com.hasom.examabstractfactory2.abst.GuiFactory;
import com.hasom.examabstractfactory2.linux.LinuxGuiFactory;
import com.hasom.examabstractfactory2.mac.MacGuiFactory;
import com.hasom.examabstractfactory2.win.WinGuiFactory;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {


        switch (0) {
            case 0:
                return new MacGuiFactory();
            case 1:
                return new LinuxGuiFactory();
            case 2:
                return new WinGuiFactory();

        }

        return null;
    }
}
