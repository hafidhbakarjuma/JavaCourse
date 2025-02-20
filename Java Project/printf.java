public class printf {
    public static void main (String a[]) {
        // PRINTF is a method used to format output
        // %s for string
        // %d for integer
        // %.2f for float with 2 decimal places
        // %n for new line
    
        String name = "Demba bro";
        int age = 30;
        double height = 1.78;
        double weight = 75.6;
        String address = "123 Main St, City, State";
        String phoneNumber = "(123) 456-7890";
        String email = "hafidhbakar504@gmail.com";

        System.out.printf("Hello, World!");
        System.out.printf("\nMy name is %s ", name);
        System.out.printf("\nMy age is %d ", age);
        System.out.printf("\nMy height is %.2f meter ", height);
        System.out.printf("\nMy weight is %.2f kilograms ", weight);
        System.out.printf("\nMy address is %s", address);
        System.out.printf("\nMy phone number is %s ", phoneNumber);
        System.out.printf("\nMy email address is %s ", email);
        System.out.printf("\n");

        double price = 10.12;

        System.out.printf("$%.2f", price);
        System.out.printf("\n");
    }
}
