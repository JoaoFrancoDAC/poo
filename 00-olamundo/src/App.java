public class App {
    public static void main(String[] args) throws Exception {
        //comentário de uma linha

        /*
        * comentarioem
        * bloco
        */

        System.out.println("Hello, World!");
        System.out.println(); //sysout > autocomplete

        //tipos de dados
        //<tipoVar> <nomeVar1>, <nomeVar2>, <nomeVar3> ...;
        double x, y ,z;
        // <tipoVar> <nomeVar> = <valor>;
        String nome = "Victor";


        // inteiros
        byte a = -50;                 // 8  bits -> -128 a 127
        short b = 15750;              // 16 bits -> -32768 a 32767
        int c = 10500000;             // 32 bits ->  padrão
        long d = 10500000000000l;     // 64 bits -> -2e^64 a 2e^64 -1


        // decimais
        float e = 4.85f;              // 32 bits
        double f = -185.48;           // 64 bits -> padrão


        // booleano
        boolean teste = true;         // boolean sempre ocupa 1 bit
        boolean outroTeste = false;


        //texto
        char letra = 'a';             // uso de aspas simples. ocupa 2 bytes e usa UNICODE
        String outroNome = "Victor";  // nao é um tipo de dado primitivo


        // type casting ( converter um tipo de dado para outro )
        f = (double) b;
        c = (int) e;


                // Operadores

        // Aritméticos
        x = 10.5;
        y = -4.5;
        z = 2.2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        x++;                        //incremento unitário
        x--;                        //decremento unitário

        System.out.println(x);
        System.out.println(x++);    // uso a variável e depois incremento
        System.out.println(x);
        System.out.println(++x);    // incremento e depois uso a variável

        c = 2;
        int w = ++c;
        System.out.println(w);

        w = c--;
        System.out.println(w);
        System.out.println(c);




        // Atribuição
        x +=2;       // x = x + 2
        z -=1.5;     // z = z -1.5


        // comparação
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);




        // Lógicos

        System.out.println(!false);             // NOT
        System.out.println(true && false);      // AND
        System.out.println(true || false);      // OR

        System.out.println("----------------");


        // Estruturas de decisão
        // if-else
        int idade = 19;
        if (idade > 18){
            System.out.println("Você é maior de idade.");
        } else if (idade < 0) {
            System.out.println("Idade inválida");
        } else {
            System.out.println("Voce é menor de idade");
        }


        // NÃO É BOA PRATICA !
        if (idade>18)
            System.out.println("você é maior de idade");
        else
            System.out.println("Você é  menor de idade");


        // switch
        String opcao = "a";

        switch (opcao) {
            case "a":
                System.out.println("Opção a");
                break;
            case "b":
                System.out.println("Opçao b");
                break;
            case "c":
                System.out.println("Opção c");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Estruturas de repetição

        // for

        for (int i = 0; i <= 5; i++ ) {                 // esse i só existe dentro do for
            System.out.println(i);
        }


        int i;
        for ( i = 0; i<= 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);



        for (i = 0; i < 10; i++) {
            i++;
            if (i==3) {
                continue; // interrompe a iteração
            }
            System.out.println(i);
            if (i ==5) {
                break;  //   interrompe o for
            }
        }


        // while
        i = 10;
        while (i >0) {
            System.out.println(i--);
        }


        
    }
}
