package com.hasom.examabstractfactorypattern.abst;

/**
 * Created by leejunho on 2017. 6. 29..
 */

public interface BikeFactory {

    public Body createBody();
    public Wheel createWheel();
}
