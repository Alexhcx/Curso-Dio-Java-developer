package edu.Alexandre.EscopoEstruturasDeControle.EstruturasRepeticao;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args){

        int contador = 0;

        while(contador != 30){
            System.out.println(contador);
            contador++;
        }

        Scanner sc = new Scanner(System.in);
        String  [] nomes = new String [5];
        int cont = 0;

        System.out.println("Digite um nome:");
        String nome = sc.nextLine();

        while(!nome.equalsIgnoreCase("Alexandre") && cont < nomes.length){

            nomes[cont] = nome;
            cont++;

            if(cont < nomes.length){
                System.out.println("Digite um nome:");
                nome = sc.nextLine();
            }
        }

        for(int j = 0; j < nomes.length; j++){
            System.out.println(nomes[j]);
        }

        sc.close();

        // Exemplo do curso
        exemploWhile();

    }

    public static void exemploWhile(){
        double mesada = 50.0;

        while(mesada > 0){

            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");

            mesada = mesada - valorDoce;

        }
        System.out.println("mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada");

    }

    public static double valorAleatorio(){

        Random numeroAleatorio = new Random();

        return numeroAleatorio.nextDouble(9);
    }

    public static double valorThreadAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
