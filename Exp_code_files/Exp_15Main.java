public class Exp_15Main {
          public static void main(String[] args) {
                    StringBuilder first = new StringBuilder("Hello");
                    first.append(" World");
                    System.out.println(first);
                    System.out.println("Length: " + first.length());

                    StringBuilder second = new StringBuilder();
                    for (int i = 1; i <= 5; i++) {
                              second.append(i);
                              second.append(",");
                    }
                    second.deleteCharAt(second.length() - 1);
                    System.out.println(second);

                    StringBuilder third = new StringBuilder("Java");
                    third.insert(0, "Hello ");
                    System.out.println(third);
          }
}
