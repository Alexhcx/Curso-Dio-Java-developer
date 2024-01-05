package edu.Alexandre.EstruturasDeDadosAPIstreams.ConceitoNoEncadeamento;

public class MainRefatorado {
    public static void main(String[] args) {
        
        NoRefatorado<String> no1 = new NoRefatorado<>("conteudo No 1");
        NoRefatorado<String> no2 = new NoRefatorado<>("conteudo No 2");

        no1.setProximoNo(no2);        

        NoRefatorado<String> no3 = new NoRefatorado<>("conteudo No 3");
        no2.setProximoNo(no3);
        
        NoRefatorado<String> no4 = new NoRefatorado<>("conteudo No 4");
        no3.setProximoNo(no4);

        //No 1 -> No 2 -> No 3 -> No4 -> Null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.err.println("----------------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
         System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
