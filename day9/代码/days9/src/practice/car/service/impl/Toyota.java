package practice.car.service.impl;

import practice.car.entity.Gasoline92;
import practice.car.service.Car;

public class Toyota implements Car<Gasoline92> {

    @Override
    public void oil(Gasoline92 gasoline92) {
        System.out.println("加"+gasoline92.getName());
    }
}
