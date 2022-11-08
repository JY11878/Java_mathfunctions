/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_mathsqrt;
import java.util.Scanner;
import static java.lang.Math.sqrt;
/**
 *
 * @author Augustus
 */
public class Java_Mathsqrt {

    public static void main(String[] args) {
    
        double x = 9.0, y=16.0, z, num1, num2, num3, num4;
        Scanner scan = new Scanner(System.in);
        z= x + y;
        
         System.out.printf("Square root of z: %.1f\n", sqrt(z));
         System.out.printf("Square root of 100: %.1f\n", sqrt(100.0));
            System.out.printf("Math.sqrt(Math.sqrt(625.0)) = %.1f\n",sqrt(sqrt(625.0)) );
            System.out.println("Give a value to number 1");
            num1 = scan.nextDouble();
            System.out.printf("Math.sqrt(num1) = %.1f\n",sqrt(num1) );
            System.out.println("Give a value to number 2");
            num2 = scan.nextDouble();
            System.out.println("Give a value to number 3");
            num3 = scan.nextDouble();
            System.out.printf("Math.max(num2,num3) = %.1f\n",Math.max(num2,num3) );
            System.out.printf("Math.pow(num2,num3) = %.1f\n",Math.pow(num2,num3) );
            System.out.printf("Math.log(num2) = %.1f\n",Math.log(num2) );
            System.out.printf("Math.log(num3) = %.1f\n",Math.log(num3) );
             
    }
}