import java.util.Scanner;

public class Earnings{

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println( "Enter taxRate" );
int taxRate = input.nextInt();
int earnings = input.nextInt();
int totalEarnings = input.nextInt();

double earnings = taxRate / totalEarnings * (20 / 100) ;

System.out.printf("earnings is %d", taxRate);





}
}