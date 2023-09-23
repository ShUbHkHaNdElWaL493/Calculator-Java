package com.codes.java.calculator;

import java.util.Scanner;

class Features extends Calculator {
    
    public String StartUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("CALCULATOR");
        System.out.println("");
        System.out.println("Enter 'A' for performing an algebraic function.");
        System.out.println("Enter 'E' for performing an exponential function.");
        System.out.println("Enter 'L' for performing a logarithmic function.");
        System.out.println("Enter 'T' for performing a trigonometric function.");
        System.out.println("Enter anything else to exit the program.");
        System.out.println("");
        return sc.nextLine();
    }
    
}
