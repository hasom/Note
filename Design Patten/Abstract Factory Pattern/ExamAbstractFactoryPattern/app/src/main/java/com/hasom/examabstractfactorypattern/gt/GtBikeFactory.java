package com.hasom.examabstractfactorypattern.gt;

import com.hasom.examabstractfactorypattern.abst.BikeFactory;
import com.hasom.examabstractfactorypattern.abst.Body;
import com.hasom.examabstractfactorypattern.abst.Wheel;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
