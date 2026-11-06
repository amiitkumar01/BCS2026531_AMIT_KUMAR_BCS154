public class Exp_6Main {
          public static void main(String[] args) {
                    int[] first = { 10, 20, 30, 40, 50 };
                    for (int i = first.length - 1; i >= 0; i--) {
                              System.out.println(first[i]);
                    }

                    int[] second = { 2, 5, 1, 8, 3, 4 };
                    int smallest = second[0];
                    int index = 0;
                    for (int i = 1; i < second.length; i++) {
                              if (second[i] < smallest) {
                                        smallest = second[i];
                                        index = i;
                              }
                    }
                    System.out.println("Smallest: " + smallest + " at index " + index);

                    int[] third = { 4, 9, 2, 9, 7 };
                    boolean found = false;
                    for (int i = 0; i < third.length && !found; i++) {
                              for (int j = i + 1; j < third.length; j++) {
                                        if (third[i] == third[j]) {
                                                  System.out.println("Repeated value: " + third[i]);
                                                  found = true;
                                                  break;
                                        }
                              }
                    }
                    if (!found) {
                              System.out.println("No repeated value");
                    }
          }
}