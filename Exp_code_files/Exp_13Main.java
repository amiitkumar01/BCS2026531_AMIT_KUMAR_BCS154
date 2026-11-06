public class Exp_13Main {
          public static void main(String[] args) {
                    String word = "Programming";
                    System.out.println("Length: " + word.length());
                    System.out.println("Position of g: " + word.indexOf('g'));
                    System.out.println("Upper case: " + word.toUpperCase());

                    String text = "Java";
                    String reversed = "";
                    for (int i = text.length() - 1; i >= 0; i--) {
                              reversed += text.charAt(i);
                    }
                    System.out.println("Reversed: " + reversed);

                    String palindrome = "racecar";
                    boolean isPalindrome = true;
                    for (int i = 0; i < palindrome.length() / 2; i++) {
                              if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
                                        isPalindrome = false;
                                        break;
                              }
                    }
                    if (isPalindrome) {
                              System.out.println(palindrome + " is a palindrome");
                    } else {
                              System.out.println(palindrome + " is not a palindrome");
                    }

                    String s = "abc";
                    for (int i = 0; i < s.length(); i++) {
                              for (int j = i + 1; j <= s.length(); j++) {
                                        System.out.println(s.substring(i, j));
                              }
                    }
          }
}