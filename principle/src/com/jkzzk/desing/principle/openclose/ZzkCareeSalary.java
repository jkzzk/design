package com.jkzzk.desing.principle.openclose;

public class ZzkCareeSalary extends ZzkCareerImpl {
    private Double salary;

    public ZzkCareeSalary(String careerName, String careerPeriod, Double salary) {
        super(careerName, careerPeriod);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
