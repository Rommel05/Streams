import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumaPosNeg {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(-1);
        numeros.add(-2);
        numeros.add(-3);
        long positivos = numeros.stream()
                .filter(numero -> numero > 0)
                .count();

        long negativo = numeros.stream()
                .filter(numero -> numero < 0)
                .count();
        System.out.println("Hay " + positivos + " números positivos y " + negativo + " números negativos" );
    }
}
