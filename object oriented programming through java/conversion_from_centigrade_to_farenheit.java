/* Conversion from Centigrade to Fahrenheit */
import java.util.Scanner;
class Test
{
    float c;
    double f;
    Test(float cen){
        c=cen;
    }
    void Conversion(){
        f=(1.8*c)+32;
        System.out.println(f);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float cen=sc.nextFloat();
        Test t=new Test(cen);
        t.Conversion();
    }
}
