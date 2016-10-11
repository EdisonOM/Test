/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
