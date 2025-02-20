import java.util.Random;

public class random {
    public static void main (String a[]) {
        Random random = new Random();

        int number;

        number = random.nextInt(1,100);

        System.out.println("Random number: " + number);
    }
}