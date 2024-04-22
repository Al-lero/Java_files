import java.util.Scanner;

	
	public class Aler {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
		
		
	
		String[] array = new String[5];

		for(int i = 0; i < 5; i++) {
		
		System.out.println("Enter name: ");
		array[i] = scanner.nextLine();
		}

		
		for(int counter = 0; counter < array.length; counter++){
			System.out.printf("%s%n", array[counter]);

		}


		

}
}