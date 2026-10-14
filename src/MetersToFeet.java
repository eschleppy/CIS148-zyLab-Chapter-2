import java.util.Scanner;

public class MetersToFeet {

   public static double convert(double meters){
      return meters * 3.28;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double meters = input.nextDouble();

      System.out.printf("%.2f", convert(meters));
   }
}
