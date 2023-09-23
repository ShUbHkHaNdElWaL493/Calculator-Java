package com.codes.java.calculator;

import java.util.Scanner;

class Exponential extends Functions {
    
    public String StartUpExponential() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 'Square' for performing square.");
        System.out.println("Enter 'Cube' for performing cube.");
        System.out.println("Enter 'Exponent' for performing exponentiation.");
        System.out.println("Enter 'SquareRoot' for performing square root.");
        System.out.println("Enter 'CubeRoot' for performing cube root.");
        System.out.println("Enter 'Root' for rooting.");
        System.out.println("");
        return sc.nextLine();
    }
    
    public void CheckExponential(String a) {
        Scanner sc = new Scanner(System.in);
        switch (a) {
            case "Square" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Square(n1) + ".");
            }
            case "Cube" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Cube(n1) + ".");
            }
            case "Exponent" -> {
                System.out.println("Enter the first number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the second number.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Power(n1, n2) + ".");
            }
            case "SquareRoot" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + SquareRoot(n1) + ".");
            }
            case "CubeRoot" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + CubeRoot(n1) + ".");
            }
            case "Root" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the rooting power.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Root(n1, n2) + ".");
            }
            default -> {
                System.out.println("Please enter valid options only.");
            }
        }
    }
    
    public double Square(double x) {
        return Math.pow(x, 2);
    }
    
    public double Cube(double x) {
        return Math.pow(x, 3);
    }

    public double Power(double x, double y) {
        return Math.pow(x, y);
    }
    
    public double SquareRoot(double x) {
        return Math.pow(x, 0.5);
    }
    
    public double CubeRoot(double x) {
        double z = 1 / 3;
        return Math.pow(x, z);
    }
    
    public double Root(double x, double y) {
        double z = 1 / y;
        return Math.pow(x, z);
    }

}