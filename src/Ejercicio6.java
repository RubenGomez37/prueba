import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = sc.nextInt();
        System.out.println("Dime otro número");
        int num2 = sc.nextInt();
        int calc = 0;

        for (int i = 0; i < num2; i++) {
            calc += num1;
        }


        System.out.println(calc);
    }
}

