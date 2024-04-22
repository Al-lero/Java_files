import java.util.Scanner;

     public class Estore {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

	        int OrignalCost;
	        int Discount;
	        int item = 0;
	        int counter = 1;
	        int total = 0;
	

                System.out.println("Welcome to E-store");
                System.out.println("Enter name: ");
                  String name = scanner.nextLine();


             while(counter <= 10){
	                  System.out.println("Enter cost of item: ");
	                       int userInput = scanner.nextInt();
	                        total += userInput;
	                         counter++;
		}

            if( total >= 200){
                    int discount = (total * 10) /100;
                     int discountedCost = total - discount;

			System.out.println("Customer name: " +  name);

			System.out.printf("%s%d%n", "OriginalAmount: ", total);

			System.out.printf("%s%d%n", "discountedCost: ", discountedCost);

			System.out.println("Thanks for your patronage");
		}

		else{
 			System.out.println("No discount added");
		        System.out.println("Thanks for your patronage");
		}


		}
		}