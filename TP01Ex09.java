/*Calcular e exibir a tensão de um determinado circuito eletrônico 
  a partir dos valores da resistência e corrente elétrica que serão digitados. 
  Utilize a lei de Ohm.
 
  Dupla: Júlia Vitória e Lucas Antônio*/

  import java.util.Scanner;

  public class TP01Ex09 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite valor da resistência:");
        double r = scanner.nextDouble();

        System.out.println("Digite valor da corrente:");
        double i = scanner.nextDouble();

        double tensão = r * i;

        System.out.println(tensão);
        
        
        scanner.close();
    }
}
