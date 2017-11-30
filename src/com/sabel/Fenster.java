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
    private Model model;


    public Fenster() {
        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initEvents();

        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setColor(Farbe farbe) {
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
                model.pfeilA();
            }
        });

        jbtnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.pfeilB();
            }
        });

        jbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.pfeilC();
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
