import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String resposta;
        int continuar;
        double num1;
        double num2;


        while (true) {
            System.out.println("Digite a operação desejada (soma, sub, mult, div)");
            resposta = leitor.next();

            System.out.println("1* número:");
            num1 = leitor.nextDouble();

            System.out.println("2* número:");
            num2 = leitor.nextDouble();

            System.out.println("Resultado:");
            if(resposta.equals("soma")) {
                
                System.out.println(num1 + num2);
            }else if(resposta.equals("sub")){
                System.out.println(num1 - num2);
            }else if (resposta.equals("mult")){
                System.out.println(num1 * num2);
            }else if (resposta.equals("div")){
                System.out.println(num1/num2);
            }


            System.out.println("Deseja continuar utilizando a calculadora?(0 para encerrar ou 1 para continuar)");
            continuar = leitor.nextInt(); // le input de texto
            if (continuar==0){
                break;
            }else if(continuar==1){

            }
        }
    leitor.close();








    }
}
