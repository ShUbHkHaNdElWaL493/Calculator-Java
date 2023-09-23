package com.codes.java.calculator;

import java.util.Scanner;

class Algebraic extends Functions{
    
    public String StartUpAlgebraic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter 'Add' for performing addition.");
        System.out.println("Enter 'Subtract' for performing subtraction.");
        System.out.println("Enter 'Multiply' for performing multiplication.");
        System.out.println("Enter 'Divide' for performing division.");
        System.out.println("");
        return sc.nextLine();
    }
    
    public void CheckAlgebraic(String a) {
        Scanner sc = new Scanner(System.in);
        switch (a) {
            case "Add" -> {
                System.out.println("Enter the first number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the second number.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Sum(n1, n2) + ".");
            }
            case "Subtract" -> {
                System.out.println("Enter the first number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the second number.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Difference(n1, n2) + ".");
            }
            case "Multiply" -> {
                System.out.println("Enter the first number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the second number.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Product(n1, n2) + ".");
            }
            case "Divide" -> {
                System.out.println("Enter the dividend.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("Enter the divisor.");
                String y = sc.nextLine();
                double n2 = Double.parseDouble(y);
                System.out.println("The reuslt is " + Quotient(n1, n2) + ".");
            }
            default -> {
                System.out.println("Please enter valid options only.");
            }
        }
    }

    public double Sum(double x, double y) {
        return x + y;
    }
    
    public double Difference(double x, double y) {
        return x - y;
    }
    
    public double Product(double x, double y) {
        return x * y;
    }
    
    public double Quotient(double x, double y) {
        return x / y;
    }

}