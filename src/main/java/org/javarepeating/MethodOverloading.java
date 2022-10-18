package org.javarepeating;

public class MethodOverloading {//functions with same name but different parameters and return type

    public static void main(String[] args) {
      //  System.out.println( area(2,2));
        int l=10;
        int w=50;
        float r= 2.5f;
        int getRectangle_area=area(l,w);
        System.out.println("Area of rectangle is :"+getRectangle_area);

        float getCircle_area=area(r);
        System.out.println("Area of circle is :"+getCircle_area);

    }
    public static int area(int n1,int n2){
        int result=n1*n2;//area of rectangle
        return result;
    }
    public static float area(float n){
      float result=3.14f*n*n;//area of rectangle
        return result;
    }

}
