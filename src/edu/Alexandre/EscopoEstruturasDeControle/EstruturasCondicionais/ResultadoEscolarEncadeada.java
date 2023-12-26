package edu.Alexandre.EscopoEstruturasDeControle.EstruturasCondicionais;

public class ResultadoEscolarEncadeada {
    public static void main(String[] args){
    //Condicional encadeada

        int nota = 10;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
