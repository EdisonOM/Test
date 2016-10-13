/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        int j = 1;
        if (n < 0) {
            int l = 1;

            boolean done = false;
            while (!done) {
                System.out.println(l);
                if (l == n) {
                    done = true;
                }
                l--;
            }
        }
        if (n > 0) {
            boolean done = false;
            while (!done) {
                System.out.println(j);
                if (j == n) {
                    done = true;
                }

                j++;
            }

        }
        Scanner read = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int p = read.nextInt();
        int returnValue;
        int sum=0;
        List<Integer> theList= new ArrayList();
        if (p >= 0) {
            returnValue = (int)MathFunctions.SquareRootAndAddThree(p);
            theList.add(returnValue);
        }
        for(int you:theList){
        sum=sum+you;
        
        }
        System.out.println("The sum is "+ sum);
        
        
        double circleArea;
        String radiusEntry = JOptionPane.showInputDialog("Enter Radius:");
        int radius = Integer.parseInt(radiusEntry);
        circleArea = (double)MathFunctions.AreaOfCircle(radius);
        
        String[] choices = {"Red", "Blue", "Green"};
        String circleColor = (String) JOptionPane.showInputDialog(null, "What's the "
                + "color of the circle?", "Color", JOptionPane.QUESTION_MESSAGE,
                null, 
                choices, 
                choices[1]);
        System.out.println("The color of the Circle is " + circleColor);
        System.out.println("Area of Circle = " + circleArea);
            
           
             JFrame frame = new JFrame("CIRCLE");
             frame.getContentPane().add(new Display(circleColor, (int) radius),BorderLayout.CENTER);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setSize(300,300);
             frame.setVisible(true);
    }
}
// if (returnValue > 1000) {
//
//            double sum = 0;
//            for (int i = 0; i < result.size(); i++) {
//                sum = sum + result.get(i);
//                System.out.println("The sum is " + sum);
//    }
//            
//            if 
//}
