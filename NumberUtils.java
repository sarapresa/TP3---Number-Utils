import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberUtils {

    public static double calcularMedia(List<Double> numeros){
        if(numeros.isEmpty()){
            return 0;
        }

        double soma = 0;
        for(double numero : numeros){
            soma += numero;
        }

        return soma/numeros.size();
    }

    public static double calcularMediana(List<Double> numeros){
        if(numeros.isEmpty()){
            return 0;
        }

        Collections.sort(numeros);
        int tamanhoLista = numeros.size();
        int posicaoMeio = tamanhoLista / 2;

        if(tamanhoLista % 2 == 0){
            return (numeros.get(posicaoMeio) + numeros.get(posicaoMeio - 1)) / 2;
        }
        else {
            return numeros.get(posicaoMeio);
        }
    }

    public static double calcularModa(List<Double> numeros){
        if(numeros.isEmpty()){
            return 0;
        }

        Map<Double, Integer> frequencia = new HashMap<>();
        for(double numero : numeros){
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }

        double moda = 0;
        int maxFrequencia = 0;

        for(Map.Entry<Double, Integer> entry : frequencia.entrySet()){
            if(entry.getValue() > maxFrequencia){
                maxFrequencia = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }

    public static void ordenarLista(List<Double> numeros, boolean crescente){
        if (crescente) {
            Collections.sort(numeros);
        }
        else{
            numeros.sort(Collections.reverseOrder());
        }
    }
}