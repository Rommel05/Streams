import java.util.ArrayList;
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (true) {
            num = sc.nextInt();
            numeros.add(num);
            if (num < 0) {
                break;
            }
        }
        numeros.stream()
                .filter(numeroo -> numeroo >= 0 && numeroo <= 5)
                .forEach(p2 -> System.out.println(p2));
    }
}
