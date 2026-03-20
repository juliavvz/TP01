/*A partir do diâmetro de um círculo que será digitado, 
  calcular e exibir sua área. 
  
  Dupla: Júlia Vitória e Lucas Antônio*/

  import java.util.Scanner;

  public class TP01Ex11 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite valor do diâmetro:");
        double d = scanner.nextDouble();

        double r = d / 2;

        double a = 3.14 * Math.pow(r, 2);

        System.out.println(a);
        
        scanner.close();
    }
}
