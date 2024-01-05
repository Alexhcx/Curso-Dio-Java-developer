package edu.Alexandre.EstruturasDeDadosAPIstreams.ConceitoNoEncadeamento;

public class Main {
    public static void main(String[] args) {
        
        No no1 = new No("conteudo No 1");
        No no2 = new No("conteudo No 2");

        no1.setProximoNo(no2);        

        No no3 = new No("conteudo No 3");
        no2.setProximoNo(no3);
        
        No no4 = new No("conteudo No 4");
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
