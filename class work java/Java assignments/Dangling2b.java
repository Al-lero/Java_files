import java.util.Scanner;

public class Dangling2b{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int x = 11 ;
int y = 9 ;

if (x < 10) {

 if (y > 10)
 System.out.println("*****"); 
 }

else {
System.out.println("#####");
System.out.println("$$$$$");
 
}
}
}