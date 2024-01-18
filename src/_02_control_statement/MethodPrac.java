package _02_control_statement;

import java.util.Scanner;

public class MethodPrac {
    public static void main(String[] args) {
        MethodPrac mp = new MethodPrac();
        System.out.println("원" + mp.calc(10));
        System.out.println("직사각형" + mp.calc(10.0, 5));
        System.out.println("삼각형" + mp.calc(10, 5));
    }
    public double calc(double a) {
        return 3.14 * a * a;
    }
    public double calc( double a, double b) {
        return a*b;
    }
    public int calc(int a, int b) {
        return (a*b)/2;
    }
}
