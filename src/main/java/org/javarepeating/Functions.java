package org.javarepeating;

public class Functions {
    public static void main(String[] args) { //we need to call this method under the main method but we can write aparte from the main functions either above the main either below the main
    /*  sparta();
      add(12,43);
      add(34,15);
    }
    public static void sparta(){//this my non parameterised function
        System.out.println("This is Spaartaaaa!");
    }
    public static void add(int a,int b){//this my parameterised function
        System.out.println(a+b);
    }*/


   /*  int z=sub(20,4);
        System.out.println(z);


    }
    public static int sub(int a, int b) {//this my return function
        return  a - b;

    }*/

    /*    Functions functions=new Functions();
      //  System.out.println(functions.add(21,31));
    int x=10;
        int y=20;
       int get_result= functions.add(x,y);
        System.out.println(get_result);
    }
    public int add(int num1,int num2){//without static keyword
        int result= num1+num2;
        return result;*/

        //swapping values
        int a=10;
        int b=20;
        swap(a,b);
    swap(12,14);
        }
        public static void swap(int num1 ,int num2){
            System.out.println(" values before swapping are:a="+num1+ " b="+num2);
            int c=num1;
            num1=num2;
            num2=c;
            System.out.println("Values after swapping are:a="+num1+" b= "+num2);
    }
}
