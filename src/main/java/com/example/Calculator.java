package com.example;


public class Calculator {
    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static double squaredRoot(int a) {
        return Math.sqrt(a);
    }

    public static double tripleRoot(int a) {
        return Math.cbrt(a);
    }

    public static double exponential(int a, int b) {
        return Math.pow(a, b);
    }

    public static double polynomialsImage(int a, int b, int c) {
        return (a*a) + (b*a) + c;
    }

    
}

