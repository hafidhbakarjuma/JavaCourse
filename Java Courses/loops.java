public class loops {
    public static void main(String a[]) {
        //LOOPS - while, do while, for

        //This is DO WHILE loop this loop it check condition if it's true first and then if it false it stop
        int c = 0; // c = 5; to start from (5 - 0)
        do {
            System.out.println(c);
            c++;
        } while(c <= 5); // while (i >= 0)

        System.out.println("\n");

        //This it called NESTED LOOP it means loop inside loop
        int j = 0; // j = 5; to start from (5 - 0)
        while(j <= 5) // while (j >= 0)
        {
            System.out.println(j);
            int i = 1;
            while (i<=1)
            {
                System.out.println("Hello" + i);
                i++;
            }
            j++; // we can use i-- also
        }

        System.out.println("\n");

        //This is a while loop
        int k = 0; // k = 5; to start from (5 - 0)
        while(k <= 5) // while (k >= 0)
        {
            System.out.println(k);
            k++;
        }

        System.out.println("\n");

        //This is a FOR loop
        for (int m = 5; m >= 1; m--)
        {
            System.out.println("DAY " + " - " + (m+2));
        }
    }
    
}