import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // EXERCICIO QTD PROD VENDIDO
      System.out.print("Quantos produtos vendidos? ");
      int produtos = scanner.nextInt();
      int valorProduto = 18;
      int valor_final = produtos * valorProduto;
      System.out.printf("Valor total dos produtos vendidos: %d%n", valor_final);

      scanner.close();
  }
}
