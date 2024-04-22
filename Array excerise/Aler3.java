import java.util.Scanner;

	
	public class Aler3 {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
		
		
		String[] array = new String[5];
		int[] arrayOfNumber = new int[5];

		for(int i = 0; i < 5; i++) {

		System.out.println("Enter name: ");
		array[i] = scanner.nextLine();
		}
		
		for (int i = 0; i < 5; i++){
		System.out.println("Enter Scores: ");
		arrayOfNumber[i] = scanner.nextInt();
		}
		
		System.out.println("\tStudent name\tScore");
		
		for(int counter = 0; counter < array.length; counter++){
			System.out.println("\t" + array[counter] + "    "  + "\t" + arrayOfNumber[counter]);		

			}
		
			


}
}