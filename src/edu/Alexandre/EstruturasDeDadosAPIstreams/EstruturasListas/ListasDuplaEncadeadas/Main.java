package edu.Alexandre.EstruturasDeDadosAPIstreams.EstruturasListas.ListasDuplaEncadeadas;

public class Main {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");

        System.out.println(minhaLista);
        System.out.println("");

        minhaLista.remove(4);
        minhaLista.add(4, "99");

        System.out.println(minhaLista);
        System.out.println("");

        System.out.println(minhaLista.get(4));

    }
}
