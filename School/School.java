import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	public class School {

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
		}
}