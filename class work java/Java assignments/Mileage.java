import java.util.Scanner;

public class Mileage {
 
public static void main (String[]args){

Scanner scanner =new Scanner (System.in);

System.out.println("Enter drivers mileage:");
int driversMileage = scanner.nextInt();

System.out.println("Enter drivers miles:");
int driversMiles = scanner.nextInt();

System.out.print("Enter gallon used per tank:");
int gallonUsedPerTank = scanner.nextInt();

int Mileage = driversMiles/gallonUsedPerTank ;

System.out.printf("The miles driven is %d%n ", gallonUsedPerTank);














}















}