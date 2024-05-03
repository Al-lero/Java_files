import java.util.Scanner;

public class Customer {

public static void main (String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Enter account number:");
int accountNumber = scanner.nextInt();

System.out.println("Enter balance at the begining :");
int balanceAtTheBegining = scanner.nextInt();

System.out.println("Enter items charged to customer :");
int itemsChargedToCustomer = scanner.nextInt();

System.out.println("Enter credit applied to customers account :");
int creditAppliedToCustomerAccount = scanner.nextInt();

System.out.println("Enter credit limit:");
int creditLimit = scanner.nextInt();
 
int calculateNewBalance = balanceAtTheBegining + itemsChargedToCustomer - creditAppliedToCustomerAccount;

System.out.println("Enter credit limit exceeded");

if(balanceAtTheBegining > creditLimit ){

System.out.print("Credit limit exceed");
}
else{

System.out.println("Credit limit not exceeded");
}

}

} 
