public class Exp_5Main {
          public static void main(String[] args) {
                    int[] arr = { 3, 4, 5 };
                    for (int i = 0; i < arr.length; i++) {
                              System.out.println("Index " + i + ": " + arr[i]);
                    }

                    int[] numbers = { 12, 45, 7, 33, 21 };
                    int sum = 0;
                    int largest = numbers[0];
                    for (int value : numbers) {
                              sum += value;
                              if (value > largest) {
                                        largest = value;
                              }
                    }
                    System.out.println("Sum: " + sum);
                    System.out.println("Largest: " + largest);

                    int[] values = { 5, 12, 2, 14, 7 };
                    int count = 0;
                    for (int value : values) {
                              if (value > 10) {
                                        count++;
                              }
                    }
                    System.out.println("Count greater than 10: " + count);
          }
}