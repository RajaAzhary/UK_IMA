import java.util.ArrayList;
import java.util.Scanner;

public class Ukima203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            list.add(input.nextLine());
        }
        
        tukarIsiBerpasangan(list);
        
        for (String elemen : list) {
            System.out.println(elemen);
        }
        
        input.close();
    }
    
    public static void tukarIsiBerpasangan(ArrayList<String> list) {
        int panjang = list.size();
        
        for (int i = 0; i < panjang - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}
