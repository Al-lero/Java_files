import java.util.Scanner;
 public class TwelveDay {
 public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {

  System.out.print("On the " + day);

            switch (day) {
                case 1:
                    System.out.print("st");
                    break;
                case 2:
                    System.out.print("nd");
                    break;
                case 3:
                    System.out.print("rd");
                    break;
                default:
            System.out.print("th");
        }

   System.out.println(" day of Christmas my true love gave to me");  

switch (day) {

  case 1: 
   System.out.println("A partridge in a pear tree.");

 case 2:
   System.out.println("Two turtle doves, and");

 case 3:
   System.out.println("Three French hens,");

 case 4:
   System.out.println("Four calling birds,");

 case 5:
    System.out.println("Five golden rings,");

 case 6:
    System.out.println("Six geese a laying,");

 case 7: 
   System.out.println("Seven swans a swimming,");

 case 8:
   System.out.println("Eight maids a milking,");

 case 9:
   System.out.println("Nine ladies dancing,");

 case 10:
   System.out.println("Ten lords a leaping,");

 case 11:
   System.out.println("Eleven pipers piping,");

default:
   System.out.println("Twelve drummers drumming,");

}
   
 System.out.println();

}
}
}
     