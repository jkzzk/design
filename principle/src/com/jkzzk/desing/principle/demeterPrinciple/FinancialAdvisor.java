package com.jkzzk.desing.principle.demeterPrinciple;

import java.util.ArrayList;
import java.util.List;

public class FinancialAdvisor {
    public void sayMoney() {
        List<Money> monies = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            monies.add(new Money(i * 1000));
        }

        int sum = 0;
        for (Money money : monies) {
            sum += money.getNumber();
        }

        System.out.println("一共有 ： " + sum);
    }
}
