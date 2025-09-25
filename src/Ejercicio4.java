import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Dime un número : ");
            n = sc.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("El número tiene que ser positivo");
            }
        }
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de los " + n + " primeros números es: " + suma);
        sc.close();
    }
}