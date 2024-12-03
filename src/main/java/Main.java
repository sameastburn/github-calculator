import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Calculator. Type a command:");

    while (true) {
      System.out.print("> ");
      String input = scanner.nextLine();
      String[] parts = input.split(" ");

      String command = parts[0];
      try {
        switch (command) {
          case "add":
            int addResult = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            System.out.println(addResult);
            break;

          case "subtract":
            int subtractResult = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            System.out.println(subtractResult);
            break;

          case "multiply":
            int multiplyResult = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            System.out.println(multiplyResult);
            break;

          case "divide":
            int divideResult = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            System.out.println(divideResult);
            break;

          case "fibonacci":
            int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
            System.out.println(fibonacciResult);
            break;

          case "binary":
            String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
            System.out.println(binaryResult);
            break;

          case "exit":
            System.out.println("Goodbye!");
            scanner.close();
            return;

          default:
            System.out.println("Invalid command. Try again.");
            break;
        }
      } catch (Exception e) {
        System.out.println("Error: Invalid input or command.");
      }
    }
  }
}
