package BGeneric.GInteface.service.impl;

import BGeneric.GInteface.service.Gun;
import BGeneric.GInteface.entity.NineMiBullet;

public class Uzi implements Gun<NineMiBullet> {

    @Override
    public void shoot(NineMiBullet nineMiBullet) {
        System.out.println("uzi使用"+nineMiBullet.getName()+"进行设计，威力是"+nineMiBullet.getPower());
    }
}
