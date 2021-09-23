package BGeneric.GInteface;

import BGeneric.GInteface.entity.NineMiBullet;
import BGeneric.GInteface.entity.SevenMiBullet;
import BGeneric.GInteface.service.Gun;
import BGeneric.GInteface.service.impl.Ak47;
import BGeneric.GInteface.service.impl.Uzi;

public class Main {
    public static void main(String[] args) {
        NineMiBullet nineMiBullet = new NineMiBullet("9毫米子弹",5);
        SevenMiBullet sevenMiBullet = new SevenMiBullet("7毫米子弹",9);

        Gun uzi = new Uzi();
        uzi.shoot(nineMiBullet);

        Gun ak47 = new Ak47();
        ak47.shoot(sevenMiBullet);

    }
}
