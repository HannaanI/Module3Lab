/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module3Lab;

/**
 *
 * @author hannaan
 */

import java.util.Scanner;

public class displayDigits {
    

    public static int quotient(int a, int b) {
        return a / b;
    }
    
    
    public static int remainder(int a, int b) {
        return a % b;
    }
    
  
    public static void displayDigits(int num) {
        int quotient;
        int remainder;
        int divisor = 10000;
        while (divisor > 0) {
            quotient = quotient(num, divisor);
            remainder = remainder(num, divisor);
            num = remainder;
            divisor = divisor / 10;
            System.out.print(quotient + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number that is between 1 and 99999: ");
            num = input.nextInt();
        } while (num < 1 || num > 99999);
        displayDigits(num);
    }
}
