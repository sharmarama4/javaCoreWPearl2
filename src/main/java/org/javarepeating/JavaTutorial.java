package org.javarepeating;

import java.util.Scanner;

public class JavaTutorial {
    public static void main(String[] args) {

        //System.out.println("This is spartaaaaa!");

        //datatypes
      /*  int a=50;
        System.out.println(a);*/
       /* float a=500f;
        System.out.println(a);*/
      /*  boolean a=true;
        System.out.println(a);*/
      /*  String a="This is my Tutorial";
        System.out.println(a);*/
       //type casting(implicit and explicit)
      /*  byte b=20;
        int i=b;
        System.out.println(i);*/

     /*   int num=120;
        byte b1=(byte)num;
        System.out.println(b1);*/
        //java comments(we use java comments to describe our code and java compiler ignore it)

        //operators in java
        //Arithmetic operators-,+,*,/
     /*   int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(b-a);
        System.out.println(b/a);*/

        //Relational operators<,>,==,!= we get the result as true and false
      /*  int a=10;
        int b=20;
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a!=b);*/
     //logical operators &,|| with & operator should both operand true and but with | operator should one operand true to get the value true

     /*   boolean a=true;
        boolean b=false;
        System.out.println(a&b);//false
        System.out.println(b&b);//false
        System.out.println(b&a);//false
        System.out.println(a&a);//true both operand are true
        System.out.println(a|a);//true
        System.out.println(a|b);//true
        System.out.println(b|b);//false*/

        //flow control statements if else (decision making statements)
    /*    if(18>20){//false no output
            System.out.println("18 is greater than 20");
        }
        if(20>18){//this true wel output
            System.out.println("20 is greater than 18");
        }*/

     /*   int x=20;
        int y=18;
        if(x<y){
            System.out.println("x is greater than y");
        }else{
            System.out.println("y is greater than x");
        }*/
//if ...else if statements to check multiple conditions
//int marks=65;
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a marks ?");
        int marks=scan.nextInt();
        if(marks<50) {
            System.out.println("fail");
        } else if (marks>=50 &&marks <60) {
            System.out.println("D Grade");
        } else if (marks>=60 &&marks <75) {
            System.out.println("C Grade");
        } else if (marks>=75 &&marks <90) {
            System.out.println("B Grade");
        } else if (marks>=90 &&marks <100) {
            System.out.println("A+ Grade");
        }else {
            System.out.println("Invalid!");
        }*/


       /* int num=1;
        if(num<0){
            System.out.println("Negative number");
        } else if (num>0) {
            System.out.println("Positive number");
        }else {
            System.out.println("Number is 0");
        }*/


        //looping statements are used to repeat a task multiple times till the condition reach

      //while loop(through the loop till condition true is)
      /*  int x=1;
        while(x>=4){ //for the while loop condition must be true otherwise blank result
            System.out.println(x);
            x++;//if here is no increment or decrement run the loop infinitive time because condition is true
        }
        int i=1;
        while (i<15){
            System.out.println("This the while loop:  "+i);
            i++;
        }*/

        //for loop
       /* for(int i=0;i<5;i++){
            System.out.println(i);

        }
        for(int i=0;i<10;i=i+2){
            System.out.println(i);

        }*/
        //create a for loop to display odd numbers from 0-10
      /*  for(int i=0;i<10;i++){
            if(i%2==1) {
                System.out.println(i);
            }
        }
        //create a for loop to display even numbers from 0-10

        for(int i=0;i<10;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }*/
        //do while loop(do while loop execute once even if condition is false)
      /*  int x=10;
        do{
                System.out.println("This is the do while loop: "+x);
            x++;
        }  while (x<=15);*/


       // pattern problem
     /*   int n=5;
     for (int i=0;i<5;i++){
    for (int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}*/

    /*    int m=6;
        for (int i=0;i<6;i++){
            for (int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }*/
     /*   int x=15;
        for (int i=0;i<x;i++){
            for (int j=0;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();*/


        //java function /method(function is a block of code which performs a specific task)we have to call method







        }
    public static void sparta(){
        System.out.println("This is Spaartaaaa!");
    }
}


