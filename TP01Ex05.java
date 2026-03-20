/*Calcular e exibir o volume de uma esfera a partir do valor 
 de seu diâmetro que será digitado.
 
 Dupla: Júlia Vitória e Lucas Antônio*/

 import java.util.Scanner;

  public class TP01Ex05 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite diâmetro da esfera:");
        double d = scanner.nextDouble();
        
        double ra = d / 2;

        double r = (4.0 / 3.0) * 3.14 * Math.pow(ra, 3);

        System.out.println(r);
        
        
        scanner.close();
    }
}
