package com.codes.java.calculator;

import java.util.Scanner;

class Trigonometric extends Functions {
    
    public String StartUpTrigonometric() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter the angles in radians only.");
        System.out.println("Enter 'Sin' for taking sine.");
        System.out.println("Enter 'Cos' for taking cosine.");
        System.out.println("Enter 'Tan' for taking tangent.");
        System.out.println("Enter 'Sec' for taking secant.");
        System.out.println("Enter 'Cosec' for taking cosecant.");
        System.out.println("Enter 'Cot' for taking cotangent.");
        System.out.println("Enter 'ArcSin' for taking sine inverse.");
        System.out.println("Enter 'ArcCos' for taking cosine inverse.");
        System.out.println("Enter 'ArcTan' for taking tangent inverse.");
        System.out.println("Enter 'ArcSec' for taking secant inverse.");
        System.out.println("Enter 'ArcCosec' for taking cosecant inverse.");
        System.out.println("Enter 'ArcCot' for taking cotangent inverse.");
        System.out.println("");
        return sc.nextLine();
    }
    
    public void CheckTrigonometric(String a) {
        Scanner sc = new Scanner(System.in);
        switch (a) {
            case "Sin" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Sine(n1) + ".");
            }
            case "Cos" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Cosine(n1) + ".");
            }
            case "Tan" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Tangent(n1) + ".");
            }
            case "Sec" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Secant(n1) + ".");
            }
            case "Cosec" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Cosecant(n1) + ".");
            }
            case "Cot" -> {
                System.out.println("Enter the angle.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + Cotangent(n1) + ".");
            }
            case "ArcSin" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcSine(n1) + ".");
            }
            case "ArcCos" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcCosine(n1) + ".");
            }
            case "ArcTan" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcTangent(n1) + ".");
            }
            case "ArcSec" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcSecant(n1) + ".");
            }
            case "ArcCosec" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcCosecant(n1) + ".");
            }
            case "ArcCot" -> {
                System.out.println("Enter the number.");
                String x = sc.nextLine();
                double n1 = Double.parseDouble(x);
                System.out.println("The reuslt is " + ArcCotangent(n1) + ".");
            }
            default -> {
                System.out.println("Please enter valid options only.");
            }
        }
    }

    public double Sine(double x) {
        return Math.sin(x);
    }
    
    public double Cosine(double x) {
        return Math.cos(x);
    }
    
    public double Tangent(double x) {
        return Math.tan(x);
    }
    
    public double Secant(double x) {
        return 1 / Math.cos(x);
    }
    
    public double Cosecant(double x) {
        return 1 / Math.sin(x);
    }
    
    public double Cotangent(double x) {
        return 1 / Math.tan(x);
    }
    
    public double ArcSine(double x) {
        return Math.asin(x);
    }
    
    public double ArcCosine(double x) {
        return Math.acos(x);
    }
    
    public double ArcTangent(double x) {
        return Math.atan(x);
    }
    
    public double ArcSecant(double x) {
        return Math.acos(1 / x);
    }
    
    public double ArcCosecant(double x) {
        return Math.asin(1 / x);    }
    
    public double ArcCotangent(double x) {
        return Math.atan(1 / x);
    }

}
