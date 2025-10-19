/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgrade;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student score (0-100): ");
        int score = sc.nextInt();
        String grade, remark;

        if (score >= 80 && score <= 100) { grade = "1"; remark = "Distinction"; }
        else if (score >= 75) { grade = "2"; remark = "Distinction"; }
        else if (score >= 66) { grade = "3"; remark = "Credit"; }
        else if (score >= 60) { grade = "4"; remark = "Credit"; }
        else if (score >= 50) { grade = "5"; remark = "Credit"; }
        else if (score >= 45) { grade = "6"; remark = "Credit"; }
        else if (score >= 35) { grade = "7"; remark = "Pass"; }
        else if (score >= 30) { grade = "8"; remark = "Pass"; }
        else { grade = "9"; remark = "Fail"; }

        System.out.println("Score: " + score + " | Grade: " + grade + " | Remark: " + remark);
        sc.close();
    }
}
