
/**Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.

 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("milha marítima:");
        double m = sc.nextDouble();

        System.out.println("Medida em quilometros: " + (m * 1.852));

        sc.close();
    }
}