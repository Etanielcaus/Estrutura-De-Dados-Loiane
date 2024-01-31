package com.EstruturaDeDados.Vetores;

public class Main {
    public static void main(String[] args) {
        // Vetores é uma lista comum, com vários itens.

        // Guardar Temperaturas
        double temp01 = 33.5;
        double temp02 = 33;
        double temp03 = 31;
        double temp04 = 29;

        double[] temperatura = new double[365];
        temperatura[1] = temp01;
        temperatura[5] = 34;
        temperatura[364] = 98;
        temperatura[150] = temp02;

//        System.out.println(temperatura[5]);
//        System.out.println(temperatura[7]);
//        System.out.println(temperatura[1]);


        // Iterando o array
        for (int i = 0; temperatura.length > i; i++) {
            if (temperatura[i] != 0.0){
                System.out.println(i + " : " + temperatura[i]);
            }
        }
    }
}
