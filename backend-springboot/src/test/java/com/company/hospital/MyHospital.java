package com.company.hospital;

public class MyHospital {

    public static void main(String args[]) {

        double x = 2;
        double y = 3;

        System.out.println(x + " + " + y + " = " + soma(x, y));
        System.out.println(x + " * " + y + " = " + multiplica(x, y));
        System.out.println(x + " / " + y + " = " + dividir(x, y));

    }

    public static double soma(double a, double b) {

        return a + b;

    }

    public static double multiplica(double a, double b) {

        return a * b;

    }

    public static double dividir(double a, double b) {

        return a / b;

    }

}
