public class Exp_9Main {
          public static void main(String[] args) {
                    int[][] a = {
                                        { 1, 2, 3 },
                                        { 4, 5, 6 },
                                        { 7, 8, 9 }
                    };

                    System.out.print("First row: ");
                    for (int j = 0; j < 3; j++) {
                              System.out.print(a[0][j] + " ");
                    }
                    System.out.println();

                    System.out.print("Last row: ");
                    for (int j = 0; j < 3; j++) {
                              System.out.print(a[2][j] + " ");
                    }
                    System.out.println();

                    for (int j = 0; j < 3; j++) {
                              int sum = 0;
                              for (int i = 0; i < 3; i++) {
                                        sum += a[i][j];
                              }
                              System.out.println("Column " + (j + 1) + " sum: " + sum);
                    }

                    int count = 0;
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 3; j++) {
                                        if (a[i][j] > 5) {
                                                  count++;
                                        }
                              }
                    }
                    System.out.println("Values greater than 5: " + count);
          }
}