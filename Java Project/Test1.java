import java.util.Scanner;

public class Test1 {
    public static void main (String a[]) {
        Scanner scanner = new Scanner(System.in);
try{
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Are you student? (true/false): ");
        boolean student = scanner.nextBoolean();

        System.out.println("You are: " + name);
        System.out.println("You are: " + age + " years old");
        System.out.println("You GPA is: " + gpa);
        System.out.println("You are: " + student);

        if (student) {
            System.out.println("You are a student.");
        }
        else {
            System.out.println("You are not a student.");
        }
    } catch (Exception e) {
        System.out.println("Invalid input! Please enter the correct data format.");
    }
        scanner.close();
    }
}