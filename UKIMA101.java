import java.util.Scanner;

public class UKIMA101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lirikLagu = input.nextLine();
        String lirikDiubah = ubahLirik(lirikLagu);
        System.out.println(lirikDiubah);
    }

    public static String ubahLirik(String lirikLagu) {
        char[] lirikArray = lirikLagu.toCharArray();
        StringBuilder lirikDiubah = new StringBuilder();

        char[] tabelPengganti = {'A', 'E', 'I', 'O', 'U'};

        int panjangLirik = lirikLagu.length();

        for (int i = 0; i < panjangLirik; i++) {
            char karakter = lirikArray[i];

            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u' ||
                karakter == 'A' || karakter == 'E' || karakter == 'I' || karakter == 'O' || karakter == 'U') {
                int sisaBagi = i % 5; 
                karakter = tabelPengganti[sisaBagi]; 
            }

            lirikDiubah.append(karakter);
        }

        return lirikDiubah.toString();
    }
}
