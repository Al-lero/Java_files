import java.util.Scanner;

public class Largest {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

int number;
int max = Interger.MinValue;
int min = Interger.MaxValue
char choice;
do{

System.out.println("Enter a number: ");
int number = input.nextInt();


 if (input > max){
    max = number;
  }

 if (input < min){
  min = number;
  }

  System.out.print("Do you want to continue yes/no ? :");
   choice = input.next().charAt(0);


}while (choice == 'yes' choice == 'YES');

System.out.print("Smallest: " + min);
System.out.print("Largest: " + max);




}
}