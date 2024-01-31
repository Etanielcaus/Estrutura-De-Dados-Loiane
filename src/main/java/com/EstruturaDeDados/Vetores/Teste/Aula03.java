package com.EstruturaDeDados.Vetores.Teste;

import com.EstruturaDeDados.Vetores.Vetor;

public class Aula03 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("azul");
        vetor.adiciona("vermelho");
        vetor.adiciona("verde");
        vetor.adiciona("azul");
        vetor.adiciona("Rosa");

//        vetor.visualizarVetor();
        vetor.visualizarTamanhoDoVetor();
        vetor.visualizarVetorCompleto();
    }
}
