package org.javarepeating;

public class Arrays {
    public static void main(String[] args) {//arrays help us to store multiple elements of same datatype
     /*   char[] c = new char[5];//datatype[] variable name=new datatype[size];
        c[0] = 'a';//index number start with 0
        c[1] = 'b';
        c[2] = 'c';
        c[3] = 'd';
        c[4] = 'e';
   for (char cha:c) {
            System.out.println(cha);}
        for (int i = 0; i < 5; i++) {
            c[4] = 'd'; //we can change single value with index number
            System.out.println(c[i]);
        }
        int[] numbers = new int[10]; //print the values 0-10 with arrays
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
        //we can also print the elements like this
        String[] names = {"Ram", "Shyam", "Gita", "Hari"};
        for (String name : names
        ) {
            System.out.println(name);
        }
        //create single arrays
        int num = 5;
        int x[] = new int[5];
        int y[] = new int[5];
        int z[] = new int[5];
        for (int i = 0; i < 5; i++) {
            x[i] = i;
        }
        for (int i = 0; i < 5; i++) {
            y[i] = num;
            ++num;
        }
        System.out.println("values in Array A:");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("values in Array B:");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            z[i] = x[i] + y[i];
        }
        System.out.println();
        System.out.println("values in Array C:");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i] + " ");

        }*/

        //multidimentional array
        int num1 = 1;
        int[][] nums = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = num1;
                ++num1;
            }


        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}

