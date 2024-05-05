import java.util.Scanner;
	public class Task5{
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int score = 0;
		int counter = 1;
		int total = 0;
		

	while (counter <= 10){
		System.out.println("enter score: ");
			int userInput = scanner.nextInt();
			total += userInput;
			counter++;
			
		
		}

System.out.println("Average of the score is " + total/10/);

}
}