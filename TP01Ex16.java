/**Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
 * 
 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double graus, rad, seno, cosseno, tangente, secante;

        System.out.print("Digite o ângulo em graus: ");
        graus = sc.nextDouble();

        rad = graus * Math.PI / 180;

        seno = Math.sin(rad);
        cosseno = Math.cos(rad);
        tangente = Math.tan(rad);
        secante = 1 / cosseno;

        System.out.println("Seno = " + seno);
        System.out.println("Cosseno = " + cosseno);
        System.out.println("Tangente = " + tangente);
        System.out.println("Secante = " + secante);

        sc.close();
    }
}