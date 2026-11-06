import java.util.Arrays;

public class Exp_11Main {
          static int bubbleSort(int[] a) {
                    int swaps = 0;
                    for (int i = 0; i < a.length - 1; i++) {
                              for (int j = 0; j < a.length - 1 - i; j++) {
                                        if (a[j] > a[j + 1]) {
                                                  int temp = a[j];
                                                  a[j] = a[j + 1];
                                                  a[j + 1] = temp;
                                                  swaps++;
                                        }
                              }
                    }
                    return swaps;
          }

          static void selectionSort(int[] a) {
                    for (int i = 0; i < a.length - 1; i++) {
                              int minIndex = i;
                              for (int j = i + 1; j < a.length; j++) {
                                        if (a[j] < a[minIndex]) {
                                                  minIndex = j;
                                        }
                              }
                              int temp = a[i];
                              a[i] = a[minIndex];
                              a[minIndex] = temp;
                    }
          }

          public static void main(String[] args) {
                    int[] first = { 5, 1, 4, 2, 8 };
                    bubbleSort(first);
                    System.out.println("Sorted: " + Arrays.toString(first));

                    int[] second = { 64, 25, 12, 22, 11 };
                    selectionSort(second);
                    System.out.println("Sorted: " + Arrays.toString(second));

                    int[] third = { 5, 1, 4, 2, 8 };
                    int swaps = bubbleSort(third);
                    System.out.println("Swaps: " + swaps);
          }
}