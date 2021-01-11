import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {

        System.out.println("COLOCANDO EM ORDEM DECRESCENTE!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int z = scanner.nextInt();

        System.out.println("A ordem digitada foi: " + x + ", " + y + ", " + z);

        if (x > y && y > z) {
            System.out.println("Em ordem descrescente teremos: " + x + ", " + y + ", " + z);
        } else if (x > z && z > y) {
            System.out.println("Em ordem descrescente teremos: " + x + ", " + z + ", " + y);
        } else if (z > x && z > y) {
            System.out.println("Em ordem descrescente teremos: " + z + ", " + y + ", " + x);
        } else if (y > x && x > z) {
            System.out.println("Em ordem descrescente teremos: " + y + ", " + x + ", " + z);
        } else if (y > z) {
            System.out.println("Em ordem descrescente teremos: " + y + ", " + z + ", " + x);
        } else {
            System.out.println("Em ordem descrescente teremos: " + z + ", " + y + ", " + x);
        }
    scanner.close();
    }
}
