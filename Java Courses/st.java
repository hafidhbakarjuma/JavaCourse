class Mobile{
    String brand;
    int price;
    String name; // if use Static it can change all the name of the Phone

    public void show() {
        System.out.println("brand: " + brand + "  " + "price: " + price + " " + "name: " + name);
    }
}

public class st {
    public static void main(String a[]) {
        Mobile obj1 = new Mobile();
        obj1.name = "Bambi";
        obj1.price = 1500;
        obj1.brand = "Apple";

        Mobile obj2 = new Mobile();
        obj2.name = "Demba";
        obj2.price = 1700;
        obj2.brand = "Samsung";

        obj1.show();
        obj2.show();  
    }
}
