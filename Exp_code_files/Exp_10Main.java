import java.util.ArrayList;

public class Exp_10Main {
          public static void main(String[] args) {
                    int day = 3;
                    switch (day) {
                              case 1:
                                        System.out.println("Monday");
                                        break;
                              case 2:
                                        System.out.println("Tuesday");
                                        break;
                              case 3:
                                        System.out.println("Wednesday");
                                        break;
                              default:
                                        System.out.println("Invalid day");
                    }

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(40);
                    System.out.println(list);
                    System.out.println("Size: " + list.size());
                    System.out.println("Item at index 2: " + list.get(2));

                    ArrayList<Integer> updated = new ArrayList<>();
                    updated.add(10);
                    updated.add(20);
                    updated.add(30);
                    updated.add(40);
                    updated.set(1, 25);
                    updated.remove(3);
                    System.out.println(updated);
                    System.out.println("Size: " + updated.size());
          }
}