package com.hasom.examabstractfactorypattern.sam;

import com.hasom.examabstractfactorypattern.abst.BikeFactory;
import com.hasom.examabstractfactorypattern.abst.Body;
import com.hasom.examabstractfactorypattern.abst.Wheel;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class SamBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
