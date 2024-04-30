import java.util.Scanner;

public class Owner {
    private static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        String P = """
            1 -> Phone book
            2 -> Message
            3 -> Chat
            4 -> Call register
            5 -> Tones
            6 -> Settings
            7 -> Call divert
            8 -> Games
            9 -> Calculator
            10 -> Reminder
            11 -> Clock
            12 -> Profiles
            13 -> Sim service
            """;

        System.out.println(P);
        System.out.println("Enter 0 to Exit");

        int userInput = input.nextInt();
        if (userInput >= 0 && userInput <= 1) {
            switch (userInput) {
                case 0 -> exit();
                case 1 -> menu1();
            }
        } else {
            System.out.println("Enter a valid number!");
            mainMenu();
        }
    }

  

    public static void menu1() {
        String J = """
            1 -> Search
            2 -> Service Nos
            3 -> Add name
            4 -> Erase
            5 -> Edit
            6 -> Assign tone
            7 -> Send b'card
            8 -> Options
                1.Type of views
                2. Memory Status
            9 -> speed dials
            10 -> voice tags
            """;

        System.out.println(J);
        System.out.println("");
        System.out.println("Enter 99 to back to main menu");
        System.out.println("Pick an option: ");

        int userInput = input.nextInt();
        if ((userInput >= 1 && userInput <= 10) || (userInput == 99)) {
            switch (userInput) {
                case 99 -> mainMenu();
                case 1 -> {
                    System.out.println("Welcome to the search screen!");
                    System.out.println("Nothing to search for.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 2 -> {
                    System.out.println("Welcome to the Service Nos screen!");
                    System.out.println("Nothing here.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 3 -> {
                    System.out.println("Welcome to the Add name screen!");
                    System.out.println("No directory for name storing.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 4 -> {
                    System.out.println("Welcome to the erase screen!");
                    System.out.println("Nothing to erase.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 5 -> {
                    System.out.println("Welcome to the edit screen!");
                    System.out.println("Nothing to edit.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 6 -> {
                    System.out.println("Welcome to the Assign tone screen!");
                    System.out.println("No downloaded tones.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 7 -> {
                    System.out.println("Welcome to the Send card screen!");
                    System.out.println("No cards to send.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 8 -> subMenu1_8();
                case 9 -> {
                    System.out.println("Welcome to the Speed dials screen!");
                    System.out.println("Your speed dials are: \n1. Bill +2348102345678\n2. Liz +23456789012");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    menu1();
                }
                case 10 -> {
                    System.out.println("Welcome to the Voice tags screen!");
                    System.out.println("No new voice tags.\nReturning to previous page.");
                    System.out.println();
                    menu1();
                }
            }
        } else {
            System.out.println("Please enter a valid number.");
            menu1();
        }
    }

    public static void subMenu1_8() {
        System.out.println("""
            1. Type of view.
            2. Memory status
            """);
        System.out.println("Pick an option or Enter 99 to return to previous menu: ");
        int option = input.nextInt();
        if (((option == 1) || (option == 2)) || (option == 99)) {
            switch (option) {
                case 99 -> menu1();
                case 1 -> {
                    System.out.println("No type of view available.\nReturning to previous page.");
                    System.out.println();
                    subMenu1_8();
                }
                case 2 -> {
                    System.out.println("Memory size is 2GB\nYou have used a total of 235.46MB");
                    System.out.println("Returning to previous page.");
                    System.out.println();
                    subMenu1_8();
                }
            }
        } else {
            System.out.println("Please enter a valid number.");
            subMenu1_8();
        }

    }





      public static void exit() {
        System.out.printf("Thanks, Come back Later");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
            welome Nokia
            press
            1 -> for menu
            99 -> To Exit
            """;

        System.out.println(prompt);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Press 1 for main menu or 99 to terminate.");
            int begin = input.nextInt();
            if (begin == 1 || begin == 99) {
                if (begin == 1) {
                    Owner.mainMenu();
                } else {
                    System.out.println("Thanks for using our app");
                    break;
                }
            } else {
                System.out.println("Enter either 1 or 99!");
            }
        }
    }
}
