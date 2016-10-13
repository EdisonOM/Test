/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author shelbaltz
 */
public class Display extends JPanel {//extends class JPanel
    String circleColor;//makes string circleColor
    int side;//makes int side
    Display(String circleColor, int radius){//begins method
        this.circleColor=circleColor;//sets circleColor to circleColor from test color
        this.side=radius*2;//sets side to diameter of circle
    }
    @Override//overides paintComponent
    public void paintComponent(Graphics g){ //Makes method paintComponent
        super.paintComponent(g); // Runs JPanel.paintComponent
        if(circleColor.equals("Blue")){//sets color to blue if blue
        g.setColor(Color.blue);
    
    }
if(circleColor.equals("Red")){//sets color to red if red
        g.setColor(Color.red);
    }
if(circleColor.equals("Green")){//sets color to green if green
        g.setColor(Color.green);
}
g.fillOval(0,0,side , side);//draws circle
}
}