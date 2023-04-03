import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner lerTeclado = new Scanner(System.in);

      // EXERCICIO HORAS EM MINUTOS E SEGUNDOS
      System.out.print ("Quantas horas? ");
      final int HORA_MINUTOS = 60,
                HORA_SEGUNDOS=3600;
      int horas = lerTeclado.nextInt();

     int horasEMMinutos = horas *HORA_MINUTOS;
     int horasEMSegundos = horas *HORA_SEGUNDOS;
     System.out.println ("Horas em minutos:"+horasEMMinutos);
     System.out.println ("horas em segundos:" +horasEMSegundos);
     lerTeclado.close();
  }
}

