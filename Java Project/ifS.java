public class ifS {
    public static void main (String a[]) {
        boolean isStudent = true;
        double price =  9.99;

        if (isStudent) {
            System.out.println("You get a student discount 10%");
            price *= 0.9;
            System.out.printf("your ticket is %.2f\n", price);
        }
        else {
            System.out.println("your price ticket is $" + price);
        }
    }
}
