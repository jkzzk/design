package com.jkzzk.desing.principle.InterfaceSegregation;

// 接口隔离，强调接口功能要隔离，但是要适度，不能分隔太细，反而会造成维护难、可读性差
public class Dog implements IEatAnimalAction, ISwimAnimalAction {
    @Override
    public void eat() {
        System.out.println("狗在吃!");
    }

    @Override
    public void swim() {
        System.out.println("狗在游!");
    }
}
