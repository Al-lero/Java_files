import java.util.Scanner;

public class LuckyNumber{

public static void main(String[] args){
 
Scanner scanner = new Scanner(System.in);


String prompt = """
welome to LuckyNumber
""";

System.out.println(prompt);

int counter = 1;

System.out.println("How many times will you like to play");
int playTimes = scanner.nextInt();

System.out.println("Enter number");
int number = scanner.nextInt(); 

while (number > ){
number = number + 1; // increment counter by 1;
}
 counter++;

number = 20;
 
System.out.println("Enter a number");
 number = scanner.nextInt();

if (number == 20 ){
System.out.printf("You are correct");
}

else if (number <= 20){
System.out.printf("Too low");
}

if (number > 20){
System.out.println("Too high");

}

}
}
