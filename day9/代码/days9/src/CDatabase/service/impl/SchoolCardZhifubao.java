package CDatabase.service.impl;

import CDatabase.service.SchoolCard;

public class SchoolCardZhifubao implements SchoolCard {
    @Override
    public void deposit() {
        System.out.println("支付宝充值");
    }
}
