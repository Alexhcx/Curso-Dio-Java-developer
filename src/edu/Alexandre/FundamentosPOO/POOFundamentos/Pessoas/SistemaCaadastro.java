package edu.Alexandre.FundamentosPOO.POOFundamentos.Pessoas;

public class SistemaCaadastro {
    public static void main (String[] args){
        Pessoa Alexandre = new Pessoa("123456789-12","Alexandre Nazareth");

        Alexandre.setEndereco("Rua 261");

        System.out.println(Alexandre.getNome() + " - " + Alexandre.getCpf());
    }
}
