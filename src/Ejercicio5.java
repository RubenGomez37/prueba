import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números");
        int num = sc.nextInt();
        int contador = 0;

        while (num >= 0) {
            System.out.println("Dime más números(Con un número negativo finaliza el programa");
            contador++;
            num = sc.nextInt();
        }
        System.out.println("Has introducido " + contador + " números positivos");
        sc.close();
    }
}
