/**Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
 * 
 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da aresta?");
        double aresta = sc.nextDouble();

        double area = aresta * aresta;

        System.out.println("A área do quadrado é " + area);

        sc.close();
    }
}
