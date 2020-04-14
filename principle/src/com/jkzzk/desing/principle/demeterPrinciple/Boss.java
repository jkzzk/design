package com.jkzzk.desing.principle.demeterPrinciple;

public class Boss {

    public void queryMoney(FinancialAdvisor financialAdvisor) {
        financialAdvisor.sayMoney();
    }
}
