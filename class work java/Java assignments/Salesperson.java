import java.util.Scanner;

public class Salesperson{

public static void main (String[]args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter sales person gross sales");
int sales = scanner.nextInt();

double salary = 200 + sales * 0.09;

System.out.printf("total salesperson earning is %.2f%n", salary);






}




}