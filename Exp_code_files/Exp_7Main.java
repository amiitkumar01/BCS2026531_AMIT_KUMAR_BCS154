public class Exp_7Main {
          public static void main(String[] args) {
                    int steps = 0;
                    for (int i = 1; i <= 10; i++) {
                              steps++;
                    }
                    System.out.println("Steps: " + steps);

                    steps = 0;
                    for (int i = 1; i <= 10; i++) {
                              for (int j = 1; j <= 10; j++) {
                                        steps++;
                              }
                    }
                    System.out.println("Steps: " + steps);

                    int n = 1024;
                    int divisions = 0;
                    while (n > 1) {
                              n = n / 2;
                              divisions++;
                    }
                    System.out.println("Halving steps: " + divisions);
          }
}