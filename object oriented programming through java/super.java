/* super keyword - Rectangle and Triangle inheritance
Triangle extends Rectangle, uses super() to call parent constructor
*/
import java.util.*;
class Rectangle
{
    int a,b;
    Rectangle(int c,int d){
        a=c;
        b=d;
    }
    int getRectangle(){
        int A;
        A=a*b;
        return A;
    }
}
class Triangle extends Rectangle
{
    float B;
    Triangle(int x,int y){
        super(x,y);
    }
    float getTriangle(){
        B=(a*b)/2;
        return B;
    }
}
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Triangle t=new Triangle(n,m);
        int i=t.getRectangle();
        float f=t.getTriangle();
        System.out.println("Area of Rectangle is : "+i);
        System.out.println("Area of Triangle is : "+f);
    }
}
