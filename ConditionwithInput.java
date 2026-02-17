import java.util.Scanner;

public class ConditionwithInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();   // name first

        System.out.println("Enter your age:");
        int age = input.nextInt();    // age second

        if (name.equals("anil") && age > 18) {
            System.out.println("Welcome to the club");

        } else if (name.equals("Navnit") && age < 18) {
            System.out.println("You are not allowed");

        } else if (name.equals("nilesh") && age == 18) {
            System.out.println("You are also allowed");

        } else {
            System.out.println("Condition not matched");
        }
    }
}
