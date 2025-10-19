/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accommodationapp;

import java.util.Scanner;

class Area {
    private String name;
    private int occupants;
    private boolean[] lights = new boolean[3]; // 3 lights

    public Area(String name) {
        this.name = name;
        this.occupants = 0;
    }

    public String getName() {
        return name;
    }

    public int getOccupants() {
        return occupants;
    }

    public void addOccupants(int n) {
        if (n > 0) {
            occupants += n;
        }
    }

    public void removeOccupants(int n) {
        if (n > 0) {
            occupants -= n;
            if (occupants < 0) occupants = 0;
        }
    }

    public void switchLightOn(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
        }
    }

    public void switchLightOff(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
        }
    }

    public void reportStatus() {
        System.out.println("Area: " + name);
        System.out.println("Occupants: " + occupants);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
    }
}

public class AccommodationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area gym = new Area("Gym Area");
        Area pool = new Area("Swimming Area");
        Area activeArea = gym; // default

        String choice;

        do {
            System.out.println("\n--- Accommodation Menu ---");
            System.out.println("S - Select active area (G = Gym, P = Swimming)");
            System.out.println("W - Add occupants");
            System.out.println("X - Remove occupants");
            System.out.println("Y - Switch ON a light (1-3)");
            System.out.println("Z - Switch OFF a light (1-3)");
            System.out.println("R - Report status");
            System.out.println("Q - Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextLine().toUpperCase();

            switch (choice) {
                case "S":
                    System.out.print("Select area (G = Gym, P = Swimming): ");
                    String areaChoice = sc.nextLine().toUpperCase();
                    if (areaChoice.equals("G")) activeArea = gym;
                    else if (areaChoice.equals("P")) activeArea = pool;
                    else System.out.println("Invalid area selection!");
                    break;

                case "W":
                    System.out.print("Enter number of occupants to add: ");
                    if (sc.hasNextInt()) {
                        int n = sc.nextInt();
                        sc.nextLine(); // consume newline
                        activeArea.addOccupants(n);
                    } else {
                        System.out.println("Invalid input! Must be an integer.");
                        sc.nextLine();
                    }
                    break;

                case "X":
                    System.out.print("Enter number of occupants to remove: ");
                    if (sc.hasNextInt()) {
                        int n = sc.nextInt();
                        sc.nextLine();
                        activeArea.removeOccupants(n);
                    } else {
                        System.out.println("Invalid input! Must be an integer.");
                        sc.nextLine();
                    }
                    break;

                case "Y":
                    System.out.print("Enter light number to switch ON (1-3): ");
                    if (sc.hasNextInt()) {
                        int light = sc.nextInt();
                        sc.nextLine();
                        if (light >= 1 && light <= 3) activeArea.switchLightOn(light);
                        else System.out.println("Invalid light number!");
                    } else {
                        System.out.println("Invalid input! Must be 1, 2, or 3.");
                        sc.nextLine();
                    }
                    break;

                case "Z":
                    System.out.print("Enter light number to switch OFF (1-3): ");
                    if (sc.hasNextInt()) {
                        int light = sc.nextInt();
                        sc.nextLine();
                        if (light >= 1 && light <= 3) activeArea.switchLightOff(light);
                        else System.out.println("Invalid light number!");
                    } else {
                        System.out.println("Invalid input! Must be 1, 2, or 3.");
                        sc.nextLine();
                    }
                    break;

                case "R":
                    activeArea.reportStatus();
                    break;

                case "Q":
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (!choice.equals("Q"));

        sc.close();
    }
}
