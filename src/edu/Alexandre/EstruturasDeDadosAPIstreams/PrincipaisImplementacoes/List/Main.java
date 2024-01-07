package edu.Alexandre.EstruturasDeDadosAPIstreams.PrincipaisImplementacoes.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Pegeout"));

        System.out.println(carros.contains(new Carro("Ford")));
        System.out.println(carros.get(2));

        System.out.println(carros.indexOf(new Carro("Fiat")));

        System.out.println(carros.remove(2));
        System.out.println(carros);
    }
    
}
