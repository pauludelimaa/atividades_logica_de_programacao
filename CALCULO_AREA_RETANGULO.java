import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // EXERCICIO AREA RETANGULO
      System.out.print ("Qual a base? ");
      //System.out.print ("Base:");
     double base = input.nextDouble();
         System.out.print ("Qual a altura? ");
            double altura = input.nextDouble ();
                 double areaRetangulo=base*altura;
      System.out.printf ("Com a base do retangulo igual a: %.2f\n e a altura a: %.2f\n a area é igual a: " +areaRetangulo, base, altura, areaRetangulo);
      
      
      
  }
}

