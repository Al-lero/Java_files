import java.util.Scanner;
		
		public class TaskTwo {
			public static void main(String[] args){
				Scanner scanner = new Scanner(System.in);

			int[] array = new int[10];

			for (int i = 0; i < 10; i++) {
			
			System.out.println("Enter scores: ");
			array[i] = scanner.nextInt();
			}

			for ( int counter = 0; counter < array.length; counter++){
				System.out.printf("%s%n", array[counter]);

				}








}
}