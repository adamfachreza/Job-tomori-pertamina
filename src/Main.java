import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                if (j == 5) {
                    System.out.println();
                    for (int k = 1; k <= 1; k++) {
                        for (int l = 5; l >= 1; l--) {
                            System.out.print(l);
                            if (l == 1) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
//        Segitiga Siku - Siku
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Bilangan Fibonaci
        int x = 0, y = 1, z = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci = ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print(z + " ");
            x = y;
            y = z;
            z = x + y;
        }
    }
}
