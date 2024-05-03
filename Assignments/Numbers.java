import java.util.Scanner;

public class Numbers { 				//4.36

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Enter 2 numbers");
int firstNumbers = scanner.nextInt();
int secondNumber = scanner.nextInt();

if ( firstNumbers == secondNumber ){
 System.out.print ("0");
}

else{
if ( firstNumbers > secondNumber ){
 System.out.print ("1");
}

else {
if ( firstNumbers < secondNumber ){
 System.out.print ("-1");

}


}
}
}
}