package edu.Alexandre.EscopoEstruturasDeControle.EstruturasCondicionais;

public class ResultadoEscolarTernaria {
    public static void main(String[] args){
        //Condicional Ternaria
    
            int nota = 7;
            String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";

            System.out.println(resultado);

            int nota2 = 5;
            String resultado2 = (nota2 >= 7) ? "Aprovado" : (nota2 >= 5 && nota2 < 7) ? "Recuperação" : "Reprovado";

            System.out.println(resultado2);
    
        }
}
