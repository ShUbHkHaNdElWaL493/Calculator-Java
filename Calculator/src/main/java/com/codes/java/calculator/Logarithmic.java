package com.codes.java.calculator;

import java.util.Scanner;

class Logarithmic extends Functions {
    
    public String StartUpLogarithmic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 'Logarithm_e' for performing natural logarithm.");
        System.out.println("Enter 'Logarithm_10' for performing logarithm to the base of 10.");
        System.out.println("Enter 'Logarithm' for performing logarithm.");
        System.out.println("");
        return sc.nextLine();
    }
    
    public void CheckLogarithmic(String a) {
        Scanner sc = new Scanner(System.in);
        switch (a) {
            case "Logarithm_e" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Logarithm_e(n1) + ".");
            }
            case "Logarithm_10" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Logarithm_10(n1) + ".");
            }
            case "Logarithm" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the base.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Logarithm(n1, n2) + ".");
            }
            default -> {
                System.out.println("Please enter valid options only.");
            }
        }
    }

    public double Logarithm_e(double x) {
        return Math.log(x);
    }
    
    public double Logarithm_10(double x) {
        return Math.log10(x);
    }
    
    public double Logarithm(double x, double y) {
        return Math.log(x) / Math.log(y);
    }

}
