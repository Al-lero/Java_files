import java.util.Scanner;

	public class Estore3 {
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

					System.out.println("Enter percentage: ");
 						int percentage = scanner.nextInt();

				while(percentage != -1){
	                                System.out.printf("Please enter cost for item(enter 1 or -1 to quit)",+ counter);
	                                        percentage = scanner.nextInt();
						item = counter++;
						

					
	
			}

				if( total >= 200){
					int discount = (total * 10) /100;
					int discountedCost = total - discount;

					System.out.println("Custormer name: " + name);

					System.out.println(percentage);

					System.out.printf("%s%d%n", "OriginalAmount: ", total);

					System.out.printf("%s%d%n", "discountedCost: ", discountedCost);

					System.out.println("Thanks for your patronage");
			}

				else{
					System.out.println("Custormer name: " + name);
					System.out.printf("%s%d%n", "OriginalAmount: ", total);
					System.out.println("No discount added");
 					System.out.println("Thanks for your patronage");
			}


			}
			}