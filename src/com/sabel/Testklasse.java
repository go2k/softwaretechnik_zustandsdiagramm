package com.sabel;

public class Testklasse {

    public static void main(String[] args) {
        Fenster fenster = new Fenster();
        Model model = new Model(fenster);
        fenster.setModel(model);
        System.out.println("Ende");
    }

}
