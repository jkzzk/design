package com.jkzzk.desing.principle.openclose;

public class ZzkCareerImpl implements IZzkCareer {

    private String careerName;
    private String careerPeriod;

    public ZzkCareerImpl() {
    }

    public ZzkCareerImpl(String careerName, String careerPeriod) {
        this.careerName = careerName;
        this.careerPeriod = careerPeriod;
    }

    @Override
    public String getCareerName() {
        return this.careerName;
    }

    @Override
    public String getCareerPeriod() {
        return this.careerPeriod;
    }
}
