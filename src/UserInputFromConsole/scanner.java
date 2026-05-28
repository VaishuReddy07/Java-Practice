package UserInputFromConsole;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("Hey %s, How are you? \n");
        String status = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Thankyou for the information");
        scanner.close();

    }
}
