import java.util.Scanner;

public class SumOfDigit {

 public static void main(String[] args) {

  Scanner Scanner = new Scanner(System.in);

System.out.print("Enter number between 0 and 1000: ");
 int number = Scanner.nextInt();

int sum = 0;

while ( number > 0) {
 sum += number % 10;
 number/= 10;
}

System.out.println("Sum of the digits is " + sum);




 
}




}