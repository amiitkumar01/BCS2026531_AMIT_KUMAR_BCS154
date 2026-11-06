public class Exp_8Main {
          public static void main(String[] args) {
                    int[][] m = new int[3][4];
                    int value = 1;
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 4; j++) {
                                        m[i][j] = value++;
                              }
                    }
                    System.out.println("Matrix:");
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 4; j++) {
                                        System.out.print(m[i][j] + " ");
                              }
                              System.out.println();
                    }

                    int[][] a = {
                                        { 1, 2, 3 },
                                        { 4, 5, 6 },
                                        { 7, 8, 9 }
                    };

                    int[][] transpose = new int[3][3];
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 3; j++) {
                                        transpose[j][i] = a[i][j];
                              }
                    }
                    System.out.println("Transpose:");
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 3; j++) {
                                        System.out.print(transpose[i][j] + " ");
                              }
                              System.out.println();
                    }

                    for (int i = 0; i < 3; i++) {
                              int sum = 0;
                              for (int j = 0; j < 3; j++) {
                                        sum += a[i][j];
                              }
                              System.out.println("Row " + (i + 1) + " sum: " + sum);
                    }
          }
}