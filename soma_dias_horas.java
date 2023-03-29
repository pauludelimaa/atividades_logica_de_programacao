import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Get the total bill amount
      System.out.print("Quantos dias? ");
      int qdv = scanner.nextInt();

      // Get the number of people
      System.out.print("Quantas horas?" );
      int qhv = scanner.nextInt();

      // Calculate the amount owed by each person
      int calc = ((qdv * 24)+qhv) ;

      // Print the result
      System.out.printf("Resultado %d\n",calc);
  }
}
