import java.util.Scanner;

public class ResultN{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter name");
String name = scanner.nextLine();

System.out.println("Enter score1");
int score1 = scanner.nextInt();

System.out.println("Enter score2");
int score2 = scanner.nextInt();

System.out.println("Enter score3");
int score3 = scanner.nextInt();

int totalScore = score1 + score2 + score3;


if(totalScore<=100){
System.out.printf("error"); 
}
else {
System.out.printf( "passed by "  + name + totalScore );
}


if (totalScore >= 80){
System.out.println("A");
} 
else if(totalScore<=79){
System.out.printf("B");
}

if (totalScore >= 69) {
  System.out.printf("C");
 }
else if(totalScore <= 40) {
System.out.printf("D");
}

}

}