import java.util.Scanner;
public class NumberOfYear{

public static void main (String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("collect ");
int minutes = scanner.nextInt();

int mintuesInAYear=525600;
int year = minutes / 525600;
int minutesPerDay = 1440;
int numberOfYear = 1902;

int remainingDaysInTermsOfMinutes = (minutes % 525600) ;


int remainingDays = remainingDaysInTermsOfMinutes/minutesPerDay;

System.out.printf(" %d NumberOfYear ", year);
System.out.printf(" %d NumberOfDaysRemaining ", remainingDays);




}






}