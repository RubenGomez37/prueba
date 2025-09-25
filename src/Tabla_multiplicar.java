import java.util.Scanner;

public class Tabla_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número para decirte la tabla de multiplicar (Del 1 al 10)");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + i + "="+ num * i);

        }


    }
}