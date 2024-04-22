import java.util.Scanner;

	public class Estore4 {
		
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to E-store");
			System.out.println("Please Enter Name: ");
			String name = scanner.nextLine();

			System.out.println("Enter discount percentge: ");
			double discountPercentage = scanner.nextDouble();
		
			double totalCost = 0;
			int counter = 0;

			System.out.println("Please Enter Cost of item or -1 to quit : ");
			double costOfItem = scanner.nextDouble();			

			do {
				totalCost = totalCost + costOfItem;
				System.out.println("Please Enter Cost of item or -1 to quit : ");
				costOfItem = scanner.nextDouble();
                        	counter++;

                        } while (costOfItem != -1);
				
			System.out.println("Customer Name:"+ name);
			System.out.printf("Original cost: %.2f%n", totalCost);

			double discount;
			double discountedCost; 
			

			 if(totalCost >= 200) {
				 discount = (totalCost * discountPercentage) / 100;
				 discountedCost = totalCost - discount;
				 System.out.printf("The discounted cost is %.2f%n", discountedCost);
			}

			else if(totalCost <= 200) {
				System.out.println("The discounted cost: 0 (no discount added)");
			}


				System.out.println("Thanks for your patronage");
															
							
							}
						}
					
			 



