package com.mark;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hl4350hb on 3/22/2017.
 */
public class HelloGUI extends JFrame{
    private JPanel rootPanel;
    private JButton clickHereButton;
    private JLabel myFirstLabel;

    protected HelloGUI() {
        setContentPane(rootPanel);
        pack();
        setVisible(true);

        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFirstLabel.setText("Hello, GUI!");
            }
        });
    }
}
