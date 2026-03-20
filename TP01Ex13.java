/*Calcular e exibir a velocidade final (em km/h) de um automóvel, 
 a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s²) 
 e do tempo de percurso (em s) que serão digitados. 
 
 Dupla: Júlia Vitória e Lucas Antônio*/


 import java.util.Scanner;

  public class TP01Ex13 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite velocidade inicial(m/s):");
        double v0 = scanner.nextDouble();

        System.out.println("Digite valor da aceleração(m/s²):");
        double a = scanner.nextDouble();

        System.out.println("Digite valor do tempo(s):");
        double t = scanner.nextDouble();

       double vms = v0 + (a * t);
       double vf = vms * 3.6;


        System.out.println(vf);

        scanner.close();
    }
}
