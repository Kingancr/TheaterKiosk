import java.util.Scanner;
public class Main {
    static void main() {
         /*
         class TheaterKiosk
             main()
                // Declare variables
                num userAge
                // Input section
                output "What is your age: "
                input userAge
                // Conditional logic (Simple If)
                if userAge >= 21 then
                   output "You get a paper wrist band."
                end if
                else
                    Output "You don't get a paper wrist band."
                end else
            return
        end class
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age: ");
        int userAge = scanner.nextInt();

        if (userAge >= 21) {
            System.out.println("You get a paper wrist band");
        }
        else {
            System.out.println("You don't get a paper wrist band");
        }

    }
}
