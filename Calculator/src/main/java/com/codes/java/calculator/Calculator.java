/* You are using Calculator.
   It can be used for all real numbers.
   For using this calculator, input the 2 numbers
   in separate lines with the function between
   them.
 */

package com.codes.java.calculator;

public class Calculator {

    public static void main(String[] args) {
        Features X = new Features();
        Algebraic X1 = new Algebraic();
        Exponential X2 = new Exponential();
        Logarithmic X3 = new Logarithmic();
        Trigonometric X4 = new Trigonometric();
        int DummyVariable = 0;
        do {
            String Decider1 = X.StartUp();
            switch (Decider1) {
                case "A" -> {
                    String Decider2 = X1.StartUpAlgebraic();
                    X1.CheckAlgebraic(Decider2);
                }
                case "E" -> {
                    String Decider2 = X2.StartUpExponential();
                    X2.CheckExponential(Decider2);
                }
                case "L" -> {
                    String Decider2 = X3.StartUpLogarithmic();
                    X3.CheckLogarithmic(Decider2);
                }
                case "T" -> {
                    String Decider2 = X4.StartUpTrigonometric();
                    X4.CheckTrigonometric(Decider2);
                }
                default -> {
                    System.out.println("Exiting Calculator...");
                    DummyVariable++;
                }
            }
        } while (DummyVariable == 0);
    }
    
}
