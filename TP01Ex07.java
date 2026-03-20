/*Calcular e exibir a média geométrica de dois valores 
 quaisquer que serão digitados.
  
 Dupla: Júlia Vitória e Lucas Antônio*/

  import java.util.Scanner;

  public class TP01Ex07 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite primeiro valor:");
        double v1 = scanner.nextDouble();

        System.out.println("Digite segundo valor valor:");
        double v2 = scanner.nextDouble();

        double r = Math.pow(v1 * v2, 1.0 / 2.0);

        System.out.println(r);
        
        

        
        
        scanner.close();
    }
}
