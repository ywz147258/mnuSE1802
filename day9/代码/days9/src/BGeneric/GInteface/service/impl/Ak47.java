package BGeneric.GInteface.service.impl;

import BGeneric.GInteface.service.Gun;
import BGeneric.GInteface.entity.SevenMiBullet;

public class Ak47 implements Gun<SevenMiBullet> {
    @Override
    public void shoot(SevenMiBullet sevenMiBullet) {
        System.out.println("Ak47使用"+sevenMiBullet.getName()+"进行设计，威力是"+sevenMiBullet.getPower());
    }
}
