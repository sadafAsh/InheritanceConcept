package com.soj.inheritance.multilevel;

public class BabyDog extends Dog {

    String weep;


    public BabyDog(String eat, String bark, String weep) {
        super(eat, bark);
        this.weep = weep;
    }

    public String weep() {
        return weep;
    }
}
