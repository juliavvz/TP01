/**
 *  A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
 *  Dupla: Júlia Vitória e Lucas Antônio
 */

import java.util.Scanner;

public class TP01ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("base do  triângulo:");
        double base = sc.nextDouble();

        System.out.println("altura do  triângulo:");
        double altura = sc.nextDouble();

       double area = (base * altura) / 2;

       System.out.println("área = " + area);

       sc.close();

    }
}
