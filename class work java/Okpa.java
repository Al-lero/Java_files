import java.util.Scanner;

public class Okpa{

public static void main(String[] args){

 Scanner scanner = new Scanner(System.in);
 
System.out.printf("Enter first number");
int firstNumber = scanner.nextInt();

System.out.println("Enter second number");
int secondNumber = scanner.nextInt();

double sum = firstNumber + secondNumber ;
System.out.println("The sum of 5 and 5 is " + sum);

double average = sum / 2 ;
System.out.println("The average of 5 and 5 is " + average);

double product = firstNumber * secondNumber ;
System.out.println("The product of 5*5 is  " + product);




}
}