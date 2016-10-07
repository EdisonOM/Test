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
 * @author SomeDude
 */
public class MathFunctions extends Test {

    public static void SquareRootAndAddThree() {
        List<MathFunctions> result = new ArrayList(100);
        Scanner read = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int p = read.nextInt();
        double rag = Math.sqrt(p);
        boolean done = false;
        double j = rag;
        while (!done) {
            j++;
            if (j == rag + 3) {
                done = true;
            }

        }
        System.out.println(j);
        if (p >= 0) {
//                for (MathFunctions y:result){
//                int count = 0;
//                y += count;
            result.add(new result(j));

        } 
        if (j > 1000) {

            double sum = 0;
            for (int i = 0; i < result.size(); i++) {
                System.out.println("The sum is"+sum);
            }

        }
    }
}
