package com.jkzzk.simplefactory.factory;

public class PhpVideo implements Video {
    @Override
    public void getProduct() {
        System.out.println("phpVideo生产过程！");
    }
}
