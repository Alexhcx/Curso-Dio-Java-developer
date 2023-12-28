package edu.Alexandre.FundamentosPOO.PilaresPOO.SistemaVeiculos;

class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12254124");
        jeep.ligar();

        Moto honda = new Moto();
        honda.ligar();
        honda.setChassi("12314125");

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}