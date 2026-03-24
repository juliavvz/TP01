/**Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 * 
 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
         double R = sc.nextDouble();

        System.out.println("Area:");
        double H = sc.nextDouble();

        System.out.println("Volume do cone = " + ((3.14 * R * H) / 3));

        sc.close();
    }
}