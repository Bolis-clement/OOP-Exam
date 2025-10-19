/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saccoforloop;

import java.util.Scanner;

public class SaccoForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int members = sc.nextInt();
        double interestRate = 0.05;

        for (int i = 1; i <= members; i++) {
            System.out.print("Enter principal amount for member " + i + ": ");
            double principal = sc.nextDouble();
            System.out.print("Enter investment period in years: ");
            int years = sc.nextInt();

            double amount = principal + (principal * interestRate * years);
            System.out.println("Total investment after " + years + " years: UGX " + amount + "\n");
        }

        sc.close();
    }
}

