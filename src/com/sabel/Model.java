package com.sabel;

import java.awt.*;

public class Model {

    private Fenster fenster;

    private Farbe farbe;


    public Model(Fenster fenster) {
        this.fenster = fenster;
        start();
    }

    private void start() {
        farbe = Farbe.ROT;
        fenster.setColor(farbe);
    }

    public void pfeilA() {

        switch (farbe) {
            case ROT:
                farbe = Farbe.GRUEN;
                break;
            case GELB:
                System.exit(0);
                break;
            case BLAU:
                farbe = Farbe.BLAU;
                break;
            case GRUEN:
                farbe = Farbe.BLAU;
                break;
        }
        fenster.setColor(farbe);
    }

    public void pfeilB() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.BLAU;
                break;
            case GELB:
                farbe = Farbe.BLAU;
                break;
            case BLAU:
                farbe = Farbe.ROT;
                break;
            case GRUEN:
                farbe = Farbe.GRUEN;
                break;
        }
        fenster.setColor(farbe);
    }

    public void pfeilC() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.ROT;
                break;
            case GELB:
                farbe = Farbe.ROT;
                break;
            case BLAU:
                farbe = Farbe.GRUEN;
                break;
            case GRUEN:
                farbe = Farbe.GELB;
                break;
        }
        fenster.setColor(farbe);
    }

}
