package edu.Alexandre.EstruturasDeDadosAPIstreams.AtribucoesReferencias;

public class AtribuicaoReferencia {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("IntA= " + intA + " intB= " + intB);
        intA = 2;

        System.out.println("IntA= " + intA + " intB= " + intB);

        //Tipos primitivos, copia exatamente o valor da memoria.

        MeuOBJ objA = new MeuOBJ(4);
        MeuOBJ objB = objA;

        System.out.println("objA= " + objA + " objB= " + objB);

        objA.setNum(7);

        System.out.println("objA= " + objA + " objB= " + objB);

        //Objetos, copiam a referencia de memoria.
    }
}