import java.util.Scanner;

public class Motion {

public static void main (String[]args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter initial velocity : ");
double intialVelocity = scanner.nextDouble();


System.out.println("Enter Minutes :");
double minutes = scanner.nextDouble();

System.out.println("Enter acceleration : ");
double acceleration = scanner.nextDouble();

double distanceCovered= (intialVelocity * minutes) + (acceleration *minutes*minutes) / 2;

System.out.printf("The distance covered is %.2f ", distanceCovered);
	
	}

}