import java.util.Scanner;
	public class Task4{
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

		for (int i = 1; i <=10;i++){
			if(counter % 2 == 10){
				System.out.println(i);


}
}		

System.out.println("i" + total);





}
}