package com.EstruturaDeDados.Vetores;

public class Vetor {
    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void adciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
             this.elementos[i] = elemento;
             break;
            }
        }
    }

    public void visualizarVetor(){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] != null){
                System.out.println(i + " : " + this.elementos[i]);
            }
        }
    }

    public void visualizarVetorCompleto(){
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(i + " : " + this.elementos[i]);
        }
    }
    public void visualizarTamanhoDoVetor(){
        System.out.println(this.elementos.length);
    }


}
