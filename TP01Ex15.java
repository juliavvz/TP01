/*Entrar via teclado com o valor da cotação do dólar e uma certa 
 quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
 
 Dupla: Júlia Vitória e Lucas Antônio*/

 import java.util.Scanner;

  public class TP01Ex15 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("valor (US$):");
        double v1 = scanner.nextDouble();

        System.out.println("valor cotação:");
        double a = scanner.nextDouble();

        double vr = v1 * a;

        System.out.println(vr);

    

        scanner.close();
    }
}