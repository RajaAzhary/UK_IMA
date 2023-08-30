import java.util.Scanner;

public class UKIMA102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pesanRahasia = input.nextLine();

        String[] kataKata = pesanRahasia.split(" ");
 
        StringBuilder pesanDekode = new StringBuilder();
        for (String kata : kataKata) {
            if (kata.length() >= 4 && kata.endsWith("AR")) {
                char hurufSebelumAR = kata.charAt(kata.length() - 3);

                if ("AEIOUaeiou".indexOf(hurufSebelumAR) != -1) {
                    pesanDekode.append(kata.substring(0, kata.length() - 2)).append(" ");
                } else {
                    pesanDekode.append(kata).append(" ");
                }
            } else {
                pesanDekode.append(kata).append(" ");
            }
        }

        System.out.println(pesanDekode.toString().trim());

        input.close();
    }
}
