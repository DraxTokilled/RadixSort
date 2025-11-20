import java.io.*;
import java.util.*;

public class Radix {

    // Método principal RadixSort
    public static void radixSort(int arr[]) {

        // Encontrar el valor máximo para saber cuántos dígitos tiene
        int max = Arrays.stream(arr).max().getAsInt();

        // Aplicar counting sort para cada dígito
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    // Counting Sort adaptado para radix
    public static void countingSort(int arr[], int exp) {

        int output[] = new int[arr.length];
        int count[] = new int[10];

        // Contar apariciones de cada dígito
        for (int i = 0; i < arr.length; i++)
            count[(arr[i] / exp) % 10]++;

        // Acumular valores
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Construir arreglo ordenado
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copiar salida al arreglo original
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) throws Exception {

        // Leer archivo entrada.txt
        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        List<Integer> list = new ArrayList<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            list.add(Integer.parseInt(linea.trim()));
        }
        br.close();

        // Convertir lista a arreglo
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        // Ordenar con radix
        radixSort(arr);

        // Guardar salida
        PrintWriter pw = new PrintWriter("salida_radix.txt");
        for (int n : arr) pw.println(n);
        pw.close();

        System.out.println("RadixSort completado. Revisa salida_radix.txt");
    }
}
