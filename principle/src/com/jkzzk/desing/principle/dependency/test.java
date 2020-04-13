package com.jkzzk.desing.principle.dependency;

public class test {
    public static void main(String[] args) {
        Zzk zzk = new Zzk();

        zzk.setiZzkCareer(new Xbzzk());
        zzk.speakZzkCareer();

        zzk.setiZzkCareer(new Xszzk());
        zzk.speakZzkCareer();
    }
}
