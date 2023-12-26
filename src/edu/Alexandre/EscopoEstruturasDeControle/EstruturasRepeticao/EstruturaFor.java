package edu.Alexandre.EscopoEstruturasDeControle.EstruturasRepeticao;

public class EstruturaFor {
    public static void main (String[] args){

        //Conteudo: For, For em Arrays

        // Estrutura do controle de fluxo for

        // for(bloco de inicialização; expressão booleana de validação; bloco de atualização){
        // comando que será executado até que a expressão de validação torne-se falsa.
        // }

        //For
        int contador = 0;
        int [] arrayCont = new int[15];
        
        for(int i = 0; i < 15; i++ ){
            System.out.println(contador);
            arrayCont[i] = contador;
            contador++;
        }

        System.out.println();
        
        for(int carneirinhos = 0; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + " carneirinho(s)!");
        }
        
        System.out.println();

        //For/each
        for( int numero : arrayCont ){
            System.out.println(numero);
        }

        System.out.println();

        //For em Arrays
        String [] antigosNomes = {"Alexandre", "Daniela", "Suzanna", "Kadori", "Renato"};
        String [] nomes = new String [5];

        System.arraycopy(antigosNomes, 0, nomes, 0, nomes.length);

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Esse é o(a) " + nomes[i]);
        }

        System.out.println();

        for(String nome : nomes){
            System.out.println("Esse é o(a) " + nome);
        }
    }
}
