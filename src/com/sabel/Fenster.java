package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenster extends JFrame {

    private JPanel jPanel;
    private JButton jbtnA;
    private JButton jbtnB;
    private JButton jbtnC;

    private enum Farbe {ROT, BLAU, GRUEN, GELB}

    private Farbe farbe;

    public Fenster() {
        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initEvents();
        start();
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void start() {
        farbe = Farbe.ROT;
        setColor();
    }

    private void setColor() {
        switch (farbe) {
            case ROT:
                jPanel.setBackground(Color.RED);
                break;
            case GELB:
                jPanel.setBackground(Color.YELLOW);
                break;
            case BLAU:
                jPanel.setBackground(Color.BLUE);
                break;
            case GRUEN:
                jPanel.setBackground(Color.GREEN);
                break;
        }
    }

    private void initEvents() {

        jbtnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                setColor();
            }
        });

        jbtnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                setColor();
            }
        });

        jbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                setColor();
            }
        });

    }

    private void initComponents() {
        jPanel = new JPanel();
        jbtnA = new JButton("A");
        jbtnB = new JButton("B");
        jbtnC = new JButton("C");
        jPanel.add(jbtnA);
        jPanel.add(jbtnB);
        jPanel.add(jbtnC);
        this.add(jPanel);
    }

}
