import java.util.Scanner;

public class math {
    public static void main (String a[]) {

        // MATH ex of math on java
        // Math.PI;
        // Math.pow(2, 2);
        // Math.abs(-5);
        // Math.aqrt(9);
        // Math.round(2.12);  
        // Math.ceil(3.12);
        // Math.floor(3.23)
        // Math.max(10, 20);
        // Math.min(10, 20);

        Scanner scanner = new Scanner(System.in);

        double b;
        double c;
        double d;

        System.out.print("Enter the length of side A: ");
        b = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        c = scanner.nextDouble();

        d = Math.sqrt(Math.max(b, 2) + Math.max(c, 2));

        System.out.println("The hypotenuse (side d) is: " + d);
        
        scanner.close();
    } 
}
