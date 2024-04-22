import java.util.Scanner;

   	  public class CheckOut {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
	

String continueShopping;
String customerName;
String name;
String buy;
double pieces = 0;
double unit = 0;
double VAT = 17.50;
int total = 0;
double discount = 0;
double subTotal = 0;
double billTotal = 0;
double balance = 0;
int amountPaid = 0;

               
                System.out.println("Enter Customer's name: ");
                	customerName = scanner.nextLine();
		System.out.println("Cashier's name?:  ");
			name = scanner.nextLine();
		

		do{
		System.out.println("What do you want to buy[]? ");
		buy = scanner.nextLine();
		System.out.println("How many pieces[]?: ");
		pieces = scanner.nextInt();
		System.out.println("How much per unit[]?: ");
		unit = scanner.nextInt();
		subTotal += pieces * unit;
		discount = (subTotal * discount) / 100;
		VAT = (subTotal * 17.50) / 100;
		billTotal = subTotal + VAT - discount;
		balance = amountPaid - billTotal;
		
			

		System.out.println("Do you want to buy something else[]? (yes/no)?");
		scanner.nextLine();
		continueShopping = scanner.nextLine();
		

		} while (continueShopping.equalsIgnoreCase("yes"));
	
			System.out.println("How much discount will he get?: ");
			discount = scanner.nextDouble();
			

				
			String prompt = """
					WELCOME TO SEMICOLON STORE
					MAIN BRANCH
					LOCATION: 312, HERBERT MARCAULY WAY, SABO YABA LAGOS.
					TEL:09014465195
					
					""";
			System.out.print(prompt);
			System.out.println("Cashier's Name: "+ name);
			System.out.println("Customer name: " + customerName);
			System.out.println("====================================================");
			System.out.println("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");
			System.out.println("\n---------------------------------------------------");
			System.out.printf("\t" + buy + "\t" + pieces + "\t" + unit + "\t" + pieces * unit );
			System.out.println("\n---------------------------------------------------");
			System.out.printf("\nSubTotal: " + subTotal);
			System.out.printf("\nDiscount: " + discount);
			System.out.printf("\nVAT: " + VAT);
			System.out.printf("\nBill Total: " + billTotal);
			System.out.println("\n====================================================");
			System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY: " + billTotal);
			System.out.println("How much did the Customer give to you: ");
			 amountPaid = scanner.nextInt();
			System.out.printf("\nBalance: " + (amountPaid - billTotal));
			System.out.println("\n====================================================");
			System.out.println("THANK YOU FOR YOUR PATRONAGE");
			



			

			
}

}