import java.util.Scanner;

public class RaisePower{
	public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

System.out.println("Enter number1: ");
int number1 = scanner.nextInt();

System.out.println("Enter number2: ");
int number2 = scanner.nextInt();

   int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;
}

 System.out.println(number1 + " raised to the power of " + number2 + " is " + result);

}
}