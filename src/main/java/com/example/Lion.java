package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    Feline feline;
    public Feline getFeline() {
        return feline;
    }
    public boolean isHasMane() {
        return hasMane;
    }
    public Lion(String sex, Feline feline) throws Exception {

        if ("Самец".equals(sex)) {
            hasMane = true;
            this.feline = feline;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
            this.feline = feline;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

/*    public static void main(String[] args) throws Exception {
        Feline feline1 = new Feline();
        Lion lion = new Lion("", feline1);
    }*/
}
