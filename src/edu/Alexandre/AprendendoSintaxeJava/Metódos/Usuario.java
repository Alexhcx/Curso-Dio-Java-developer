package edu.Alexandre.AprendendoSintaxeJava.Metódos;

public class Usuario {
    public static void main (String[] args){

        SmartTV minhaTV = new SmartTV();

        System.out.println("Tv está ligada? " + minhaTV.ligada);
        System.out.println("Canal atual? " + minhaTV.canal);
        System.out.println("Volume atual? " + minhaTV.volume);

        minhaTV.ligar();

        System.out.println("Novo status -> Tv está ligada? " + minhaTV.ligada);

        minhaTV.desligar();

        System.out.println("Novo status -> Tv está ligada? " + minhaTV.ligada);

        minhaTV.ligar();
        minhaTV.aumentarVolume();

        System.out.println("Novo volume -> Volume atual? " + minhaTV.volume);

        minhaTV.aumentarVolume();

        System.out.println("Novo volume -> Volume atual? " + minhaTV.volume);

        minhaTV.diminuirVolume();
        System.out.println("Novo volume -> Volume atual? " + minhaTV.volume);

        minhaTV.trocarCanal(32);
        System.out.println("Novo canal -> Canal atual? " + minhaTV.canal);

    }
}
