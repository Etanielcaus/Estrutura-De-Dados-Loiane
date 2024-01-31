package com.EstruturaDeDados.Vetores.Teste;

import com.EstruturaDeDados.Vetores.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        
        vetor.adciona("Azul");
        vetor.adciona("Laranja");

        vetor.visualizarVetor();
        vetor.visualizarTamanhoDoVetor();
        vetor.visualizarVetorCompleto();
    }
}
