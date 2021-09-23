package practice.car;

import practice.car.entity.Gasoline92;
import practice.car.entity.Gasoline95;
import practice.car.service.Car;
import practice.car.service.impl.Audi;
import practice.car.service.impl.Toyota;

public class Main {
    public static void main(String[] args) {
        Car audi= new Audi();
        audi.oil(new Gasoline95());

        Car toyota = new Toyota();
        toyota.oil(new Gasoline92());
    }
}
