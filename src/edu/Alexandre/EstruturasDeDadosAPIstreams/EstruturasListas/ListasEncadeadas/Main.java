package edu.Alexandre.EstruturasDeDadosAPIstreams.EstruturasListas.ListasEncadeadas;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Livro 1");
        minhaListaEncadeada.add("Livro 2");
        minhaListaEncadeada.add("Livro 3");
        minhaListaEncadeada.add("Livro 4");

        for(int i = 0; i< minhaListaEncadeada.size(); i++){
            System.out.println(minhaListaEncadeada.get(i));
        }

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));

        System.out.println(minhaListaEncadeada);

    }
}
