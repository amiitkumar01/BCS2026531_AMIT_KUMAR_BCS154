import java.util.Arrays;

public class Exp_12Main {
          static int insertionSort(int[] a) {
                    int shifts = 0;
                    for (int i = 1; i < a.length; i++) {
                              int key = a[i];
                              int j = i - 1;
                              while (j >= 0 && a[j] > key) {
                                        a[j + 1] = a[j];
                                        shifts++;
                                        j--;
                              }
                              a[j + 1] = key;
                    }
                    return shifts;
          }

          public static void main(String[] args) {
                    int[] first = { 7, 3, 5, 1 };
                    insertionSort(first);
                    System.out.println("Sorted: " + Arrays.toString(first));

                    int[] second = { 14, 3, 9, 21, 6 };
                    insertionSort(second);
                    System.out.println("Sorted: " + Arrays.toString(second));

                    int[] third = { 6, 5, 4, 3, 2, 1 };
                    int shifts = insertionSort(third);
                    System.out.println("Shifts: " + shifts);
          }
}