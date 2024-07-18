package org.example;

import java.util.List;

public class Lion {

    public boolean hasMane;

    FelineLion felineLion;

    public Lion(FelineLion felineLion) {
        this.felineLion = felineLion;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }


    public int getKittens() {
        return felineLion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineLion.getFood("Хищник");
    }
}
