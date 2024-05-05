import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] number = new int[size];
        


        for(int i = 0; i < size; i++) {
System.out.println("Student score "+(i+1)+" ");
            number[i] = scanner.nextInt();
        }
        int[] result = FireDrillThree.evenIndex(number);
        System.out.print(Arrays.toString(result));
    }
}
