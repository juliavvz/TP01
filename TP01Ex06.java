
import java.util.Scanner;

public class TP01Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("valor 1:");
        double a = sc.nextDouble();

        System.out.println("valor 2:");
        double b = sc.nextDouble();

        System.out.println("valor 3:");
        double c = sc.nextDouble();

        System.out.println("valor 4:");
        double d = sc.nextDouble();

        System.out.println("sua média é = " + (a + b + c + d) / 4);

        sc.close();
    }
}