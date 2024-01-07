package edu.Alexandre.EstruturasDeDadosAPIstreams.PrincipaisImplementacoes.SetHashSet;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> carros = new HashSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Pegeout"));
        carros.add(new Carro("Puma"));
        carros.add(new Carro("Alfa Romeo"));
        carros.add(new Carro("General Motors"));

        System.out.println(carros);

        Set<Carro> arvoreCarros = new TreeSet<>();

        arvoreCarros.add(new Carro("Ford"));
        arvoreCarros.add(new Carro("Volkswagen"));
        arvoreCarros.add(new Carro("Pegeout"));
        arvoreCarros.add(new Carro("Puma"));
        arvoreCarros.add(new Carro("Alfa Romeo"));
        arvoreCarros.add(new Carro("General Motors"));

        System.out.println(arvoreCarros);

    }
}
