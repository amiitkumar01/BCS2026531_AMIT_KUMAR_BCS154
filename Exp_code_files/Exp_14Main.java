public class Exp_14Main {
          public static void main(String[] args) {
                    String s = "programming";
                    int vowels = 0;
                    for (int i = 0; i < s.length(); i++) {
                              char ch = s.charAt(i);
                              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                        vowels++;
                              }
                    }
                    System.out.println("Vowels: " + vowels);

                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                              if (s.charAt(i) == 'g') {
                                        count++;
                              }
                    }
                    System.out.println("Count of g: " + count);

                    String word = "hello";
                    for (int i = 0; i < word.length(); i++) {
                              System.out.println(i + ": " + word.charAt(i));
                    }
          }
}