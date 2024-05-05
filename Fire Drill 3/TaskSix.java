import java.util.Scanner;
	
	public class TaskSix {

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			int[] scores = new int[10];
			
			for(int i = 0; i < 10; i++){
		
			System.out.println("Enter scores: ");
			scores[i] = scanner.nextInt();
			}
		
			int [] total = Function.sumIndex(scores);

			System.out.println("The sum is : " + total);

		
	}
}
