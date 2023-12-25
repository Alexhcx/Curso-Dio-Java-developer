package edu.Alexandre.SintaxeJava.AnatomiaDeClasses;

public class MinhaClasse {
    public static void main(String[] args){

        System.out.println("Hello, World");

        //Variaveis:

        // int ano = 2023;
        // ano = 2024; pode ser alterado

        // int ANOS_2000 = 2000; O Uppercase determina da variavel e sua identificação determina que ela não pode ser alterada.

        // final String BR = "Brasil";
        // BR = "Brasil"; A variavel não pode ser alterada

        // String meuNome = "Alexandre";

        // int anoFabricacao = 2022;

        // boolean verdadeira = true; 
        // boolean falso = false; 

        //Metodos: 

        String primeiroNome = "Alexandre";
        String segundoNome = "Nazareth";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
