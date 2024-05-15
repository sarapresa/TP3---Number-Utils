import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        numeros.add(13.0);
        numeros.add(18.1);
        numeros.add(22.0);
        numeros.add(15.2);
        numeros.add(12.0);
        numeros.add(25.3);
        numeros.add(27.0);
        numeros.add(15.2);
        numeros.add(30.0);
        numeros.add(16.0);

        System.out.println("Lista original: " + numeros);

        double media = NumberUtils.calcularMedia(numeros);
        System.out.println("Média: " + media);

        double mediana = NumberUtils.calcularMediana(numeros);
        System.out.println("Mediana: " + mediana);

        double moda = NumberUtils.calcularModa(numeros);
        System.out.println("Moda: " + moda);

        NumberUtils.ordenarLista(numeros, true);
        System.out.println("Lista ordem crescente: " + numeros);

        NumberUtils.ordenarLista(numeros, false);
        System.out.println("Lista ordem decrescente: " + numeros);
    }
}