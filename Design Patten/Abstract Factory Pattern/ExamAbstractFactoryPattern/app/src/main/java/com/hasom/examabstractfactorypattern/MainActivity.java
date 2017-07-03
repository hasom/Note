package com.hasom.examabstractfactorypattern;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hasom.examabstractfactorypattern.abst.BikeFactory;
import com.hasom.examabstractfactorypattern.abst.Body;
import com.hasom.examabstractfactorypattern.abst.Wheel;
import com.hasom.examabstractfactorypattern.gt.GtBikeFactory;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("hello world");

//        BikeFactory factory = new SamBikeFactory();
        BikeFactory factory = new GtBikeFactory();


        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
