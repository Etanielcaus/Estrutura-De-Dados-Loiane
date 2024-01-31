package com.EstruturaDeDados.Vetores;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){
        // Verifica se o tamanho é menor que o tamanho da capacidade do vetor.
        if (this.tamanho < this.elementos.length){
            // Aqui o array recebe em this.tamanho o elemento, ou o objeto.
            this.elementos[this.tamanho] = elemento;
            // Depois que adiciona, esse "index" adiciona mais um.
            this.tamanho++;
            System.out.println(elemento + " adicionado.");
            return true;
        } else {
            System.out.println("============= Error ============");
            System.out.println(elemento + " não foi possível adicionar, ja está cheio.");
            return false;
        }
    }

    /*public void adiciona(String elemento) throws Exception {
        // Verifica se o tamanho é menor que o tamanho da capacidade do vetor.
        if (this.tamanho < this.elementos.length){
            // Aqui o array recebe em this.tamanho o elemento, ou o objeto.
            this.elementos[this.tamanho] = elemento;
            // Depois que adiciona, esse "index" adiciona mais um.
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio");
        }
    }*/

    /*public void adciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
             this.elementos[i] = elemento;
             break;
            }
        }
    }*/


    /*
    Este visualizarVetor se tornou obsoleto, ele verifica aquele que fosse null para imprimir.
    Mas ao ser utilizado outro método em que adiciona novos objetos, e que não existe o objeto vazio,
    ele não imprime o valor.
    public void visualizarVetor(){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] != null){
                System.out.println(i + " : " + this.elementos[i]);
            }
        }
    } */

    public void visualizarVetorCompleto(){
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(i + " : " + this.elementos[i]);
        }
    }
    public void visualizarTamanhoDoVetor(){
        System.out.println(this.elementos.length);
    }


}
