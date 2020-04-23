package com.jkzzk.simplefactory.factory;

public class JavaVideo implements Video {
    @Override
    public void getProduct() {
        System.out.println("javaVideo生产过程！");
    }
}
