import java.util.Scanner;

	
	public class PartTwo {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
		
		int totalScores = 0;
		int j = 0;

		double average = 0;

		String[] names = new String[5];
		int[] scores = new int[5];

		for(int i = 0; i < 5; i++) {

		System.out.println("Enter name: ");
		names[i] = scanner.next();

		System.out.println("Enter Scores: ");
		scores[i] = scanner.nextInt();
				

		}
		
		

		System.out.println("\tStudent name\tScore");

		for(int counter = 0; counter < names.length; counter++){
			

			
		if(scores[counter] > 100){
			
			scores[counter] = 0;
			
			}

		else if(scores[counter] <= 100){
			for ( int counter = 0; ;counter < scores.length; counter++){
				totalScores += scores[counter];
				average = totalScores / names.length;
			
			}
			
			System.out.printf("Total score: ", totalScores);
			System.out.printf("Averge score: %.2f ",  average);		
				
				 
			
			
				}
}
		
		
					
			System.out.println("\t" + names[counter] + "    "  + "\t" + scores[counter]);

			
				
		
			
				

			
 		}		

		}
	