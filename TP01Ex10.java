import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("graus Celsius:");
         double C = sc.nextDouble();

        System.out.println(" : " + (C * 9/5 + 32));

        sc.close();
    }
}
