import java.util.Scanner;

	
	public class Aler2 {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
		
		
		int[] array = new int[5];

		for(int i = 0; i < 5; i++) {

		System.out.println("Enter age: ");
		array[i] = scanner.nextInt();
		}

		
		for(int counter = 0; counter < array.length; counter++){
			System.out.printf("%s%n", array[counter]);

		}


		

}
}