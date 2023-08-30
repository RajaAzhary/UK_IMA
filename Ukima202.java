import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ukima202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahToples = input.nextInt();
        int N = input.nextInt();
        
        int[] permenDiToples = new int[jumlahToples];
        for (int i = 0; i < jumlahToples; i++) {
            permenDiToples[i] = input.nextInt();
        }
        
        List<Integer[]> pasanganToples = cariPasanganToples(permenDiToples, N);
        
        for (Integer[] pasangan : pasanganToples) {
            System.out.println(pasangan[0] + " " + pasangan[1]);
        }
        
        input.close();
    }
    
    public static List<Integer[]> cariPasanganToples(int[] permenDiToples, int N) {
        List<Integer[]> pasanganToples = new ArrayList<>();
        
        for (int i = 0; i < permenDiToples.length; i++) {
            for (int j = i + 1; j < permenDiToples.length; j++) {
                if (permenDiToples[i] + permenDiToples[j] == N) {
                    Integer[] pasangan = {i + 1, j + 1};
                    pasanganToples.add(pasangan);
                }
            }
        }
        
        return pasanganToples;
    }
}
