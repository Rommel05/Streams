import java.util.ArrayList;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        ArrayList<String> palabras = new ArrayList<>();
        while (true) {
            cadena = sc.nextLine();
            palabras.add(cadena);
            if (cadena.isEmpty()) {
                break;
            }
        }
        palabras.stream()
                .forEach(pal -> System.out.println(pal));
    }
}