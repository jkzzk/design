package com.jkzzk.desing.principle.dependency;

public class Zzk {
    private IZzkCareer iZzkCareer;

    public void setiZzkCareer(IZzkCareer iZzkCareer) {
        this.iZzkCareer = iZzkCareer;
    }

    public void speakZzkCareer() {
        iZzkCareer.getZzkCareer();
    }
}
