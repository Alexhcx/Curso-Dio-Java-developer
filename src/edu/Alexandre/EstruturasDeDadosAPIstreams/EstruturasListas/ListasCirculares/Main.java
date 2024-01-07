package edu.Alexandre.EstruturasDeDadosAPIstreams.EstruturasListas.ListasCirculares;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add(" Livro 1 ");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add(" Livro 1 ");
        minhaLista.add(" Livro 2 ");
        minhaLista.add(" Livro 3 ");
        minhaLista.add(" Livro 4 ");
        minhaLista.add(" Livro 5 ");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(7));
    }
}
