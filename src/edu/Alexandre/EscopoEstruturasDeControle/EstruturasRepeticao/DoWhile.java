package edu.Alexandre.EscopoEstruturasDeControle.EstruturasRepeticao;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args){
     
        //estrutura do controle de fluxo do while

        //do

        //{
        //       comando que será executado até que a
        //       expressão de validação torne-se falsa
        //}

        //While (Expressão booleana de validação)

        do{ 
            System.out.println("Telefone tocando");

        } while(tocando());

        System.out.println("Alõ !!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
    
}
