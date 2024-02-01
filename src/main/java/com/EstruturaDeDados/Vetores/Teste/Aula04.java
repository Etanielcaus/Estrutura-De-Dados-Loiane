package com.EstruturaDeDados.Vetores.Teste;

import com.EstruturaDeDados.Vetores.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(8);

        vetor.adiciona("Azul");
        vetor.adiciona("Verde");
        vetor.adiciona("Verde");


        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
