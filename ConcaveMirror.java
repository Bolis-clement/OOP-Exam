/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concavemirror;

import java.util.Scanner;

public class ConcaveMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter object distance u (negative for concave mirror): ");
        double u = sc.nextDouble();

        System.out.print("Enter image distance v (positive for real image): ");
        double v = sc.nextDouble();

        // Calculate focal length
        double f = 1.0 / ((1.0 / v) + (1.0 / u));
        System.out.println("Focal length: " + f + " cm");

        // Check if acceptable
        if (f >= 21.0 && f <= 25.0) {
            System.out.println("Mirror is acceptable.");
        } else {
            System.out.println("Mirror is not acceptable.");
        }

        sc.close();
    }
}
