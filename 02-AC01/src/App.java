public class App {
    public static void main(String[] args) throws Exception {
        media(5, 6, 5);

        sequencia150();

        ePrimo(10);

        diaSemana(5);

        eBissexto(2000);
    }

    public static void media(double ap1, double ap2, double ac) {
        double media = ( (ap1+ap2) * 0.4) + (ac*0.2);
        System.out.println(media);

    }


    public static void sequencia150() {
        for (int i = 150; i <= 200; i++ ) {
            System.out.println(i);
        }
    }

    public static void ePrimo(int num) {
        int checa = 0;

        for(int i = 2; i <= num/2; i++){
            if(num%i==0) {
                System.out.println("O numero é divisível por "+i );
                checa = 1;
            }
        }
        if (checa == 0){
            System.out.println("O numero é primo");

        } else {
            System.out.println("Logo, o número não é primo");
        }
    }
    public static void diaSemana(int num) {
        if (num == 1) {
            System.out.println("Domingo");
        } else if (num == 2) {
            System.out.println("Segunda");
        } else if (num == 3) {
            System.out.println("Terça");
        } else if (num == 4) {
            System.out.println("Quarta");
        } else if (num == 5) {
            System.out.println("Quinta");
        } else if (num == 6) {
            System.out.println("Sexta");
        } else if (num == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Numero inválido.");;
        }

    }


    public static void eBissexto(int ano) {
        if (ano % 4 == 0){
            if (ano % 100 != 0){
                System.out.println("O ano é bissexto");
            } else {
                if (ano % 400 == 0) {
                    System.out.println("O ano é bissexto");
                } else {
                    System.out.println("O ano não é bissexto");
                }
            }
        }

    }


}







