import java.io.*;
import java.util.*;

public class Radix {

    public static void radixSort(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    public static void countingSort(int arr[], int exp) {
        int output[] = new int[arr.length];
        int count[] = new int[10];

        for (int i = 0; i < arr.length; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        List<Integer> list = new ArrayList<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            list.add(Integer.parseInt(linea));
        }
        br.close();

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        radixSort(arr);

        PrintWriter pw = new PrintWriter("salida_radix.txt");
        for (int n : arr) pw.println(n);
        pw.close();

        System.out.println("RadixSort completado.");
    }
}
