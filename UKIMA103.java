import java.util.Scanner;

public class UKIMA103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan1 = input.nextInt();
        int bilangan2 = input.nextInt();
        int bilangan3 = input.nextInt();

        int diagonal = hitungDiagonal(bilangan1, bilangan2, bilangan3);

        System.out.println(diagonal);

        input.close();
    }

    public static int hitungDiagonal(int bil1, int bil2, int bil3) {
        int d1 = bil1 % 10;
        int d2 = (bil2 / 10) % 10;
        int d3 = (bil3 / 100) % 10;

        int diagonal = d1 + d2 + d3;

        return diagonal;
    }
}
