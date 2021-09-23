package practice.car.service.impl;

import practice.car.entity.Gasoline95;
import practice.car.service.Car;

public class Audi implements Car<Gasoline95> {
    @Override
    public void oil(Gasoline95 gasoline95) {
        System.out.println("加"+gasoline95.getName());
    }
}
