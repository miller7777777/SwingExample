package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vladimir on 04.12.14.
 */
public class Main {

    private JButton clearButton;
    private JTextArea textArea;
    private JButton saveButton;
    private JButton loadButton;
    private JButton upFontButton;
    private JButton downFontButton;
    private JButton boldFontButton;
    private JButton italicFontButton;
    private JButton underlineFontButton;
    private String buffer = "";
    private int fontSize = 25;

    public static void main(String[] args) {
        Main m = new Main();
        m.buildGUI();
    }

//В текстовый редактор добавить кнопки вкл/выкл жирного шрифта,
// курсива и подчеркнутого
//Графический интерфейс для игры крестики-нолики
// 9 кнопок игровых, кнопка New Game, кнопка Exit
//Менеджеры компановки Swing

    public void buildGUI() {
        JFrame mainFrame = new JFrame("TestApp");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(300, 300, 400, 400);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JPanel supportButtonPanel = new JPanel();
        supportButtonPanel.setLayout(new GridLayout(1, 3));
        JPanel fontButtonPanel = new JPanel();
        fontButtonPanel.setLayout(new GridLayout(1, 5));

        textArea = new JTextArea();
        clearButton = new JButton("Clear");
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        upFontButton = new JButton("Up font size");
        downFontButton = new JButton("Down font size");
        boldFontButton = new JButton("Bold");
        italicFontButton = new JButton("Italic");
        underlineFontButton = new JButton("Underline");

        textArea.setFont(new Font("Arial", 0, fontSize));

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer = textArea.getText();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText() + "\n" + buffer);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        upFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fontSize++;
                textArea.setFont(new Font("Arial", 0, fontSize));
            }
        });



        downFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fontSize--;
                textArea.setFont(new Font("Arial", 0, fontSize));
            }
        });

        boldFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // textArea.setFont(new Font("Arial", 0, fontSize));
            }
        });

        italicFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // textArea.setFont(new Font("Arial", 0, fontSize));
            }
        });

        underlineFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                // textArea.setFont(new Font("Arial", 0, fontSize));
            }
        });

        supportButtonPanel.add(saveButton);
        supportButtonPanel.add(loadButton);
        supportButtonPanel.add(clearButton);

        fontButtonPanel.add(upFontButton);
        fontButtonPanel.add(downFontButton);
        fontButtonPanel.add(boldFontButton);
        fontButtonPanel.add(italicFontButton);
        fontButtonPanel.add(underlineFontButton);

        buttonPanel.add(supportButtonPanel);
        buttonPanel.add(fontButtonPanel);

        mainFrame.getContentPane().add(BorderLayout.CENTER, textArea);
        mainFrame.getContentPane().add(BorderLayout.SOUTH, buttonPanel);

        mainFrame.setVisible(true);
    }
}

//TODO: В текстовый редактор добавить кнопки вкл/выкл жирного шрифта,
// курсива и подчеркнутого