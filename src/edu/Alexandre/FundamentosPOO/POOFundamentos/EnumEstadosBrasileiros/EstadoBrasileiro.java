package edu.Alexandre.FundamentosPOO.POOFundamentos.EnumEstadosBrasileiros;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA", "Maranhão", 14),
    CEARA ("CE", "Ceará", 15);

    private String sigla;
    private String nome;
    private int IBGE;

    private EstadoBrasileiro(String sigla, String nome, int IBGE){
        this.sigla = sigla;
        this.nome = nome;
        this.IBGE = IBGE;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIBGE() {
        return IBGE;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    
}
