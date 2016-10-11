/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
package applet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ClassFrame extends JFrame {


    private static final long serialVersionUID = 2451829341034438685L;

    public static JButton inputButton = new JButton("Send");
    public static JTextArea editTextArea = new JTextArea("Type Here!");
    public static JTextArea uneditTextArea = new JTextArea();

    // Your String, defined here and usable throughout the class

    private String myString;

    public ClassFrame(int title) {

        setLayout(new BorderLayout());
       
        uneditTextArea.setEditable(false);
   //INPUT TEXT AREA
        editTextArea.setBackground(Color.BLUE);
        editTextArea.setForeground(Color.WHITE);

        //SET CONTENT PANE
        Container c = getContentPane();

        //ADD COMPONENTS TO CONTENT PANE        
        c.add(uneditTextArea, BorderLayout.CENTER);
        c.add(editTextArea, BorderLayout.SOUTH);
        c.add(inputButton, BorderLayout.WEST);

        ClassFrame.inputButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Using the class field myString to receive text from text area

                myString = editTextArea.getText();

                // Don't do this.  A blank space is bad.

                //editTextArea.setText(" ");

                // Do this instead.  An empty string is a more clear indication of what's going on
int ans = Integer.parseInt(myString);

                System.out.println(myString);                
            }
        });
    }
}


