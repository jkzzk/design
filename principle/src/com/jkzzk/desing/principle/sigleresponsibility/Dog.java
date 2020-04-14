package com.jkzzk.desing.principle.sigleresponsibility;

// 单一职责，不代表单一方法
public class Dog implements IEatAnimalAction,ISwimAnimalAction{
    @Override
    public void standEat() {
        System.out.println("狗在站着吃！");
    }

    @Override
    public void grovelEat() {
        System.out.println("狗在趴着吃！");
    }

    @Override
    public void seaSwim() {
        System.out.println("狗在海里游！");
    }

    @Override
    public void lakeSwim() {
        System.out.println("狗在湖里游！");
    }
}
