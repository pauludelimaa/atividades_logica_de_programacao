import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Get the total bill amount
      System.out.print("Quanto foi gasto? ");
      float vtg = scanner.nextFloat();

      // Get the number of people
      System.out.print("Quantas pessoas vão pagar? ");
      int qpd = scanner.nextInt();

      // Calculate the amount owed by each person
      float calc = vtg / qpd;

      // Print the result
      System.out.printf("Resultado %.2f\n", calc);
  }
}
