package edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Multifuncional;

import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Copiadora.Copiadora;
import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Digitalizadora.Digitalizadora;
import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Impressora, Digitalizadora {
    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

}