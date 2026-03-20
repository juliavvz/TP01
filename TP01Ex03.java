/*Calcular e exibir a área de um quadrado a partir do valor 
  de sua diagonal que será digitado.
  
  Dupla: Júlia Vitória e Lucas Antônio*/


  import java.util.Scanner;

  public class TP01Ex03 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite diagonal do quadrado:");
        double d = scanner.nextDouble();
        
        double r = Math.pow(d, 2)/2;

        System.out.println(r);
        
        
        scanner.close();
    }
}
