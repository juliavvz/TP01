/**Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 * 
 * Dupla: Júlia Vitória e Lucas Antônio */

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1, p2, p3, p4, p5, total, pagamento, troco;

        System.out.print("Digite o valor do produto 1: ");
        p1 = sc.nextDouble();

        System.out.print("Digite o valor do produto 2: ");
        p2 = sc.nextDouble();

        System.out.print("Digite o valor do produto 3: ");
        p3 = sc.nextDouble();

        System.out.print("Digite o valor do produto 4: ");
        p4 = sc.nextDouble();

        System.out.print("Digite o valor do produto 5: ");
        p5 = sc.nextDouble();

        total = p1 + p2 + p3 + p4 + p5;

        System.out.print("Digite o valor pago: ");
        pagamento = sc.nextDouble();

        troco = pagamento - total;

        System.out.println("Total = " + total);
        System.out.println("Troco = " + troco);

        sc.close();
    }
}