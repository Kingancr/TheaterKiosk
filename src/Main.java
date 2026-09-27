import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        if (age >= 21) {
            System.out.println("You get a paper wrist band");
        }
        else {
            System.out.println("You don't get a paper wrist band");
        }

    }
}
