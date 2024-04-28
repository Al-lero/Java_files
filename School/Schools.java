import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	public class Schools {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
int score = 0;
int scores = 100; 		
int numberOfStudent;
int coursesNumber = 0;
int total;
double average ;
int postion;
String student;		

		
		ArrayList<int[]> listOfScores= new ArrayList<>();			

			

			
			System.out.println("Enter number of student: ");
			numberOfStudent = scanner.nextInt();

			System.out.println("Enter number of courses: ");
			coursesNumber = scanner.nextInt();

			int[] arrayOfStudent = new int [numberOfStudent];
			int[] arrayOfCourses = new int [coursesNumber];

			for( int i = 0; i < arrayOfStudent.length; i++) {
			int[] arrayOfScores = new int[coursesNumber];
			
				for ( int j = 0; j < arrayOfCourses.length ;) {
			
					System.out.println("Enter scores for student" + (i+1) + "Course" + (j+1));
					 score= scanner.nextInt();
					if(score >= 0 && score <= 100){
					arrayOfScores[j] = score;
						j++;
					}
				
			
	}
			listOfScores.add(arrayOfScores);
	
}

		
	ArrayList<double[]> listPerStudent= new ArrayList<>();
		for(int[] listScore : listOfScores) {
			double[] newScoresArray = new double [listScore.length+3];
			for ( int j = 0; j < listScore.length; j++) {
				newScoresArray[j]=listScore[j];
					
		}
		newScoresArray[listScore.length]= Schools.totalNumber(listScore);
		newScoresArray[listScore.length+1]= Schools.averageScore(listScore);
		newScoresArray[listScore.length+2]= 0;
		listPerStudent.add(newScoresArray);


	}
	for(double[] listScore: listPerStudent ) {
	System.out.println(Arrays.toString(listScore));
	}

}


		public static int totalNumber(int[] numbers){
	
		int totalNumber = 0;

		for(int i = 0; i < numbers.length; i++){ 
			totalNumber += numbers[i];

			}

	return totalNumber;

			}

		public static double averageScore(int[] numbers){
	
		double averageScore = 0;

		for(int i = 0; i < numbers.length; i++){ 
		
			averageScore += numbers[i];

			}
			averageScore = averageScore / numbers.length;

	return averageScore;

			}








}







		