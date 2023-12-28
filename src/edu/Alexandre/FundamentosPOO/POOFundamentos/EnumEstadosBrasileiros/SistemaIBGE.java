package edu.Alexandre.FundamentosPOO.POOFundamentos.EnumEstadosBrasileiros;

public class SistemaIBGE {
    public static void main(String[] args){
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNomeMaiusculo() + " " + e.getNome() + " " + e.getSigla());
        }

        EstadoBrasileiro estado = EstadoBrasileiro.CEARA;

        System.out.println(estado.getSigla());
        System.out.println(estado.getIBGE());
        System.out.println(estado.getNomeMaiusculo());
        System.out.println(estado.getNome());
    }
}
