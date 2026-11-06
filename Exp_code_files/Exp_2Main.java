public class Exp_2Main {
          public static void main(String[] args) {
                    int n = 27;
                    if (n % 2 == 0) {
                              System.out.println(n + " is even");
                    } else {
                              System.out.println(n + " is odd");
                    }

                    int marks = 83;
                    if (marks >= 90) {
                              System.out.println("Grade: A");
                    } else if (marks >= 75) {
                              System.out.println("Grade: B");
                    } else {
                              System.out.println("Grade: C");
                    }

                    int year = 2024;
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                              System.out.println("Leap year");
                    } else {
                              System.out.println("Not a leap year");
                    }

                    int factorial = 1;
                    for (int i = 1; i <= 5; i++) {
                              factorial *= i;
                    }
                    System.out.println("Factorial of 5 is " + factorial);
          }
}