import java.util.Scanner;

public class CelsiusToKelvin {

   public static double convert(double degreesCelsius){
      return degreesCelsius + 273.15;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double degreesCelsius = input.nextDouble();
      System.out.printf("%.2f", convert(degreesCelsius));
   }
}
