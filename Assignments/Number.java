import java.util.Scanner;

public class Number{
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);


 String prompt = """
1. enter more numbers 
2. end
""";

 System.out.println("Enter number");
  int number = scanner.nextInt();
 
if (number==0){
	System.out.println("0");
}

if(number<0){

System.out.println("Negative");
}

else {
  System.out.println("Postive");

System.out.println("Enter 2 to go back or 1 to enter number");
  System.out.println(prompt);
	int userInput = scanner.nextInt();
}
 System.out.println("Enter number");


}
}










