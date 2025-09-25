import java.util.Scanner;

public class EncontrarPrimerDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número y te digo su primer divisor");
        int num = sc.nextInt();
        int divisor = 2;
        while (num % divisor != 0) {
            divisor++;
        }
        if (num % divisor == 0) {
            System.out.println("El primer divisor de " + num + " es " + divisor);
        } else {
            System.out.println("El primer divisor de " + num + " es " + num);
        }
    }
}
