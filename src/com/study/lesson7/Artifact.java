package com.study.lesson7;

public class Artifact {
    static int number = 0;
    String culture;
    int century;

    public Artifact() {
        number++;
        this.number = number;
        System.out.println("Номер: " + number);
    }

    public Artifact(String culture) {
        number++;
        this.number = number;
        this.culture = culture;
        System.out.println("Номер: " + number + ", Культура: " + culture);
    }

    public Artifact(String culture, int century) {
        number++;
        this.number = number;
        this.culture = culture;
        this.century = century;
        System.out.println("Номер: " + number + ", Культура: " + culture + ", Век: " + century);
    }


    public static void main(String[] args) {
        Artifact jug = new Artifact();
        Artifact spear = new Artifact("Greece");
        Artifact sward = new Artifact("Rome", 8);

    }
}
