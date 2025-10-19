/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradesummary;

import java.util.Scanner;

public class GradeSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] gradeCount = new int[10]; // index 1-9 for grades
        int students = 5;

        int i = 1;
        while (i <= students) {
            System.out.print("Enter score for student " + i + ": ");
            int score = sc.nextInt();
            int grade;

            if (score >= 80 && score <= 100) grade = 1;
            else if (score >= 75) grade = 2;
            else if (score >= 66) grade = 3;
            else if (score >= 60) grade = 4;
            else if (score >= 50) grade = 5;
            else if (score >= 45) grade = 6;
            else if (score >= 35) grade = 7;
            else if (score >= 30) grade = 8;
            else grade = 9;

            gradeCount[grade]++;
            System.out.println("Student " + i + " Grade: " + grade);
            i++;
        }

        System.out.println("\nGrade Summary:");
        for (int g = 1; g <= 9; g++) {
            System.out.println("Grade " + g + ": " + gradeCount[g] + " student(s)");
        }

        sc.close();
    }
}
