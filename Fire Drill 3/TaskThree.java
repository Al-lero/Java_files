import java.util.Arrays;
import java.util.Scanner;s

public class TaskThree {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentScore = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Student score " + (i + 1) + " : ");
            studentScore[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(studentScore));
    }
}
