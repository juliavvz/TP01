/*Enunciado: Entrar via teclado com dois valores quaisquer "X" e "Y". 
 Calcular e exibir o cálculo XY ("X" elevado a "Y"). 
 Pesquisar as funções Exp e Ln.
 Dupla: Júlia Vitória e Lucas Antônio*/

  import java.util.Scanner;

  public class TP01Ex17 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("valor 1:");
        double x = scanner.nextDouble();

        System.out.println("valor 2:");
        double y = scanner.nextDouble();

        double r = Math.pow(x, y);

        System.out.println(r);


        scanner.close();


        /* 
        Math.exp(x)
        → Retorna eˣ (exponencial)

        Math.log(x)
        → Retorna ln(x) (logaritmo natural)

        Math.pow(x, y)
        → Alternativa direta para calcular xʸ 
        */
    }
}