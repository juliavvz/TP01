/**Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
 * 
 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, a, vCubo, vEsfera, vLivre;

        System.out.print("raio da esfera: ");
        r = sc.nextDouble();

        System.out.print("aresta do cubo: ");
        a = sc.nextDouble();

        vCubo = a * a * a;
        vEsfera = (4.0 / 3.0) * Math.PI * r * r * r;

        vLivre = vCubo - vEsfera;

        System.out.println("Volume livre = " + vLivre);

        sc.close();
    }
}