package CDatabase.service.impl;

import CDatabase.service.SchoolCard;

public class SchoolCardWeixin implements SchoolCard {

    @Override
    public void deposit() {
        System.out.println("微信充值");
    }
}
