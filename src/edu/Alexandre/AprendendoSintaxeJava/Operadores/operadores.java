package edu.Alexandre.AprendendoSintaxeJava.Operadores;

public class operadores {

    public static void main(String[] args) {

        operadorUnario();
        operadoresAritimeticos();
        operadorShift();
        operadoresLogicos();
        operadorTernario();
        operadorAtribuicao();

        String nomeCompleto = "Alexandre" + "Nazareth";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);
    
    }

    public static void operadorUnario() {

        /*
         * Os operadores unários requerem apenas um operando. Operadores unários são
         * usados para executar várias operações, ou seja: Incrementando / decrementando
         * um valor em um; Negando uma expressão; Invertendo o valor de um boolean.
         */

        int x = 10;

        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int a = 10;
        int b = 10;

        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);

        int e = 10;
        int f = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~e); // - 11 (Inverte o sinal e subtrai com 1)
        System.out.println(~f); // 9 (Inverte o sinal e subtrai com 1)
        System.out.println(!c); // false (oposto ao valor booleano)
        System.out.println(!d); // true
    }

    public static void operadoresAritimeticos() {

        /*
         * Operadores aritméticos são usados para executar: adição, subtração,
         * multiplicação e divisão. Eles agem como operações matemáticas básicas.
         */

        int a = 10;
        int b = 5;

        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0, Resto da divisão
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // 21

    }

    public static void operadorShift() {

        /*
         * O operador Java left shift << é usado para mudar todos os bits de um valor
         * para o lado esquerdo de um número especificado de vezes.
         */

        System.out.println(10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
        System.out.println(10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80
        System.out.println(20 << 2); // 20 * 2 ^ 2 = 20 * 4 = 80
        System.out.println(15 << 4); // 15 * 2 ^ 4 = 15 * 16 = 240

        /*
         * O operador Java right shift >> é usado para mover os operandos da esquerda
         * para a direita pelo número de bits especificado pelo operando da direita.
         */

        System.out.println(10 >> 2); // 10 / 2 ^ 2 = 10 / 4 = 2
        System.out.println(20 >> 2); // 20 / 2 ^ 2 = 20 / 4 = 5
        System.out.println(20 >> 3); // 20 / 2 ^ 3 = 20 / 8 = 2

        // Para número positivo, >> e >>> funcionam da mesma forma
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        // Para número negativo, >>> altera o bit de paridade (MSB) para 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }

    public static void operadoresLogicos() {

        /*
         * O operador lógico && não verifica a segunda condição se a primeira condição
         * for falsa. Ele verifica a segunda condição apenas se a primeira for
         * verdadeira.
         * O operador bit a bit & sempre verifica as duas condições se a primeira
         * condição é verdadeira ou falsa.
         */

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c); // falso && verdadeiro = falso
        System.out.println(a < b & a < c); // falso & verdadeiro = falso

        System.out.println(a > b || a < c); // true || true = true
        System.out.println(a > b | a < c); // true | true = true
        // || vs |
        System.out.println(a > b || a++ < c); // true || true = true
        System.out.println(a); // 10 porque a segunda condição não está marcada
        System.out.println(a > b | a++ < c); // true | true = true
        System.out.println(a); // 11 porque a segunda condição está marcada
    }

    public static void operadorTernario() {

        /*
         * O operador ternário é usado como um substituto para a instrução if-then-else
         * e muito usado na programação Java. É o único operador condicional que leva
         * três operandos.
         */

        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);

    }

    public static void operadorAtribuicao() {

        /*
         * O operador de atribuição é um dos operadores mais comuns. É usado para
         * atribuir o valor à direita ao operando à esquerda.
         */

        int a = 10;
        int b = 20;
        a += 4; // a = a + 4 (a = 10 + 4)
        b -= 4; // b = b - 4 (b = 20 - 4)
        System.out.println(a);
        System.out.println(b);

        a = 10;

        a += 3; // 10 + 3
        System.out.println(a);
        a -= 4; // 13 - 4
        System.out.println(a);
        a *= 2; // 9 * 2
        System.out.println(a);
        a /= 2; // 18 / 2
        System.out.println(a);

        a = 10;

        a += 3; // 10 + 3
        System.out.println(a);
        a -= 4; // 13 - 4
        System.out.println(a);
        a *= 2; // 9 * 2
        System.out.println(a);
        a /= 2; // 18 / 2
        System.out.println(a);

        short c = 10;  
        short d = 10;  
        //a += b; //a = a + b internamente tem o mesmo resultado  
         //c = c + d; Erro em tempo de compilação porque 10 + 10 = 20 agora int 
         c = (short) (c + d); // 20, que agora é convertido para short  
         System.out.println(c);  
    }

}
