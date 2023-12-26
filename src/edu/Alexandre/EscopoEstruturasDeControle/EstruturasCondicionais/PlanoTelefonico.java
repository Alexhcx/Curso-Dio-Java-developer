package edu.Alexandre.EscopoEstruturasDeControle.EstruturasCondicionais;

public class PlanoTelefonico {
    public static void main(String[] args){

        String plano = "M";
        
        if(plano == "T"){
            System.out.println("100 minutos de ligação");
        } else if (plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram gratis");
        } else if (plano == "B"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram gratis");
            System.out.println("5Gb Youtube");
        }

        switch(plano){
            case "T": System.out.println("5Gb Youtube");
            case "M": System.out.println("Whats e Instagram gratis");
            case "B": System.out.println("100 minutos de ligação");
        }
    }
}
