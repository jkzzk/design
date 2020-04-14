package com.jkzzk.desing.principle.demeterPrinciple;

public class test {

    public static void main(String[] args) {

        Boss boss = new Boss();
        FinancialAdvisor financialAdvisor = new FinancialAdvisor();

        boss.queryMoney(financialAdvisor);
    }

}
