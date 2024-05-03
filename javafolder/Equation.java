import java.util.Scanner;

public class Equation{

public static void main (String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("enter number1");
int number1 = scanner.nextInt();

System.out.println("enter number2");
int number2 = scanner.nextInt();

System.out.println("enter number3");
double number3 = scanner.nextDouble();

double numerator = (number2 * number2) - 4 * (number1 - number3);
double denominator = 2 * number1;

double squareRoot = Math.sqrt(numerator);
double divider = squareRoot / denominator;
double firstResult = (-number1 + divider);
double secondResult = (-number2 - divider);

System.out.printf("The first result is %f%n" , firstResult);
System.out.printf("The second result is %f%n" , secondResult);





}
}