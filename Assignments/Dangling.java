import java.util.Scanner;

public class Dangling{

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int x = 1 ;
int y = 2 ;

if (x > 5){
}

if (y > 5){
System.out.println("x and y are > 5");
}

else{
System.out.println("x is < = 5");


}
}
}