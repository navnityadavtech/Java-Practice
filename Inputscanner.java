import java.util.Scanner;
public class Inputscanner {
    public static void main(String[] args){
        System.out.println("Please enter your name,age and salary");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        float salary = scan.nextFloat();
        System.out.println("your name is "+name);
        System.out.println("your age is "+age);
        System.out.println("your salary is"+salary);

    }
    
    
}
