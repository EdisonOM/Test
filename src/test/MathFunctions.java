/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;


/**
 *
 * @author SomeDude(Edison)
 */
public class MathFunctions  {

    public static double SquareRootAndAddThree(int p) {
        
        double x = Math.sqrt(p) + 3;
        
        return x;
        }
    
    public static double AreaOfCircle(double radius){
        double circleArea;
        
        circleArea = Math.PI * radius * radius;
        if (radius < 0){
            System.out.println("-1");
        }
//        double negative = circleArea -= 2*circleArea;
        if (circleArea < 0){
            
           String error = JOptionPane.showInputDialog("ERROR! Enter radius again:");
           int rad = Integer.parseInt(error);
        }
        return circleArea;
               
    
    }
}
