import java.util.Scanner;

public class MeterConverterToPing{

public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number in square meters: ");
  double meters = scanner.nextDouble();

  double pings = meters * 0.3025;

System.out.printf("square is %.2f", pings);



}



}