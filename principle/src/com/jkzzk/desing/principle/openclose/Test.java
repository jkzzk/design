package com.jkzzk.desing.principle.openclose;

public class Test {
    public static void main(String[] args) {
        IZzkCareer iZzkCareer = new ZzkCareeSalary("xbzzk","16-18",0d);
        ZzkCareeSalary zzkCareeSalary = (ZzkCareeSalary) iZzkCareer;
        System.out.println("职业阶段名称：" + zzkCareeSalary.getCareerName() + "；时期：" + zzkCareeSalary.getCareerPeriod()
                + "；薪资：" + zzkCareeSalary.getSalary());
    }
}
