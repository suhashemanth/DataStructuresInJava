package array;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a value: ");
    String input = scanner.nextLine();

    try {
      int number = Integer.parseInt(input);
      System.out.println(input + " is a number.");
    } catch (NumberFormatException e) {
      System.out.println(input + " is a string.");
    }
  }
}