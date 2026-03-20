/*Entrar via teclado com a base e a altura de um retângulo, 
calcular e exibir sua área

Dupla: Júlia Vitória e Lucas Antônio*/


import java.util.Scanner;

public class TP01Ex01 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite base:");
        double b = scanner.nextDouble();

        System.out.println("digite altura:");
        double a = scanner.nextDouble();

        double r = b * a;

        System.out.println(r);
        
        
        scanner.close();
    }
}
