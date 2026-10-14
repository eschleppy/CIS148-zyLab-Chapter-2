import java.util.Scanner;

public class DrivingCostsMethods {

   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
      return (drivenMiles / milesPerGallon) * dollarsPerGallon;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double milesPerGallon = input.nextDouble();
      double dollarsPerGallon = input.nextDouble();

      System.out.printf("%.2f", drivingCost(10, milesPerGallon, dollarsPerGallon));
      System.out.printf(" %.2f", drivingCost(50, milesPerGallon, dollarsPerGallon));
      System.out.printf(" %.2f", drivingCost(400, milesPerGallon, dollarsPerGallon));
      System.out.println();
   }
}
