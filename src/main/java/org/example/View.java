package org.example;

import java.util.Scanner;

public class View {
    public static void calcStart(){
        Scanner scan = new Scanner(System.in);
        System.out.print("z1=");
        String complexInA = scan.nextLine();
        System.out.print("операция: ");
        String op = scan.nextLine();
        System.out.print("z2=");
        String complexInB = scan.nextLine();
        Complex complexA = new Complex(complexInA);
        Complex complexB = new Complex(complexInB);
        Calculate calculate = new Calculate(complexA, complexB, op);
        String res = "z1" + op + "z2" + "=" + "(" + complexInA + ")" + op + "(" + complexInB + ")=" + calculate.result();
        Log.log("log.txt", res);
        System.out.println(res);
    }
}

