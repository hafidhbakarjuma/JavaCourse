//OBJECTS CLASS

class Calculator {
    public int add(int num1, int num2)
    {
        return num1 + num2;

    }
}

//class Computer {
   // public void playMusic() {
     //   System.out.println("Playing Music Now");
   // }
//}

public class objects {
    public static void main(String a[]) {
        //We need to creat a new calculator 
        Calculator calc = new Calculator();

        int result =  calc.add(10, 3);

        System.out.println("Result: " + result);

       // Computer com = new Computer();
        //com.playMusic();
    }     
}