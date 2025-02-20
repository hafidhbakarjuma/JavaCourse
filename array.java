public class array {
    public static void main (String a[]) {
        //int arr[] = {1, 2, 3, 4, 5};
        //int sum = 0;
       // arr[2] = 10;  you can change an array by using this way
        // also you can use this way arr[1] = 2; and so on

        // you can use this to run all of them by using loop
        for (int i=0; i<4; i++)
        {
            System.out.println("Sum of the array elements: " + i);
        }

        // also we ca have three demecinary array   int nums[][][] = new int [4][4][4];
        int nums[][] = new int [4][4]; // this it called jagged array

        nums[0] = new int[1];
        nums[1] = new int[2];
        nums[2] = new int[3];
        nums[3] = new int[4];

        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // This it print like that one up
        for(int n[] : nums)
        {
            for (int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}