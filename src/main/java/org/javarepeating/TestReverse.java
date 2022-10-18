package org.javarepeating;

import java.util.Scanner;

public class TestReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Enter number to reverse:");
        int num= scan.nextInt();
        int reverse=0;
        while (num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number is= "+reverse);
    }
}
