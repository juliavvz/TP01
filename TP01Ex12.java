import java.util.Scanner;

public class TP01Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
         double R = sc.nextDouble();

        System.out.println("Área:");
        double H = sc.nextDouble();

        System.out.println("Volume do cone = " + ((3.14 * R * H) / 3));

        sc.close();
    }
}
