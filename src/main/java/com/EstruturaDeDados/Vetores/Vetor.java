package com.EstruturaDeDados.Vetores;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
    }

    
    public void visualizarTamanhoDoVetor(){
        System.out.println(this.elementos.length);
    }


}
