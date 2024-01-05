package edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Estabelecimento;

import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Copiadora.Copiadora;
import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Digitalizadora.Digitalizadora;
import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Impressora.Impressora;
import edu.Alexandre.FundamentosPOO.PilaresPOO.InterfaceMultifuncional.Equipamentos.Multifuncional.EquipamentoMultifucional;

public class Fabrica {
    public static void main(String[] args){
        EquipamentoMultifucional multifuncional = new EquipamentoMultifucional();

        Impressora impressora = multifuncional;
        Digitalizadora digitalizadora = multifuncional;
        Copiadora copiadora = multifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
