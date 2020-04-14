package com.jkzzk.desing.principle.demeterPrinciple;

public class Money {
    private Integer number;

    public Money() {
    }

    public Money(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
