package edu.Alexandre.AprendendoSintaxeJava.TiposEVariaveis;

public class TiposeVariaveis {
    
    public static void main (String [] args){

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;

        /* Em Java, o sufixo F ou f é usado para indicar que um número de ponto flutuante é um float. Por padrão, o Java trata todos os números de ponto flutuante como double (que ocupa 64 bits de memória). No entanto, um float ocupa apenas 32 bits de memória. Portanto, para dizer ao Java que um número de ponto flutuante deve ser tratado como um float, adicionamos o sufixo F ou f. Neste caso, 3.14F está dizendo ao Java para tratar 3.14 como um float, em vez de um double.*/

		double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        // Não é possivel passar um int para um short, ambos tipos de variaveis tem tamanhos diferentes porem usando o comando cast (short) é possivel fazer essa conversão desde o numero int seja menor que o maximo permitido em short.
    }

}
