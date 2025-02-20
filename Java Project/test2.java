import java.util.Scanner;

public class test2 {
    public static void main (String a[]) {
Scanner scanner = new Scanner(System.in);

String name;
String place;
String name2;
String funny;

System.out.print("Enter your name: ");
name = scanner.nextLine();

System.out.print("Where do you live: ");
place = scanner.nextLine();
System.out.print("Enter a second name: ");
name2 = scanner.nextLine();
System.out.print("Enter a funny: ");
funny = scanner.nextLine();
scanner.nextLine();

System.out.println(name + " is a good kiter ");
System.out.println("He is live at " + place);
System.out.println("and his friend " + name2 + " he is so funny also");
System.out.println("he is love to play " + funny + " all time");
    
scanner.close();
    }
}
