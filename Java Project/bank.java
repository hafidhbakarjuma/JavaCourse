import java.util.Scanner;

public class bank {
    public static void main(String a[]) {

        Scanner scanner = new Scanner(System.in);

        double balance;
        int choice;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("*************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*************");
    
            System.out.println("1. Show Balance");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************");
    
    
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();
    
            switch(choice){
                case 1 -> System.out.println("SHOW BALANCE");
                case 2 -> System.out.println("DEPOSIT");
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOISE");
            }
        }
        scanner.close();
        
    }
}
