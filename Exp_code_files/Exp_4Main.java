public class Exp_4Main {
          static long fact(int n) {
                    long result = 1;
                    for (int i = 1; i <= n; i++) {
                              result *= i;
                    }
                    return result;
          }

          static long nCr(int n, int r) {
                    return fact(n) / (fact(r) * fact(n - r));
          }

          static long nPr(int n, int r) {
                    return fact(n) / fact(n - r);
          }

          static int maxOf(int a, int b) {
                    return (a > b) ? a : b;
          }

          public static void main(String[] args) {
                    System.out.println("5C2 = " + nCr(5, 2));
                    System.out.println("5P2 = " + nPr(5, 2));
                    System.out.println("Larger: " + maxOf(14, 9));
          }
}