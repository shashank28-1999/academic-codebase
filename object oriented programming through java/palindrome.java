/* Palindrome check
Ex 1:
input = 12321
output = 1
Ex 2:
input = 12345
output = 0
*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        int x,l,a,b=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        l=x;
        while(x>0){
            a=x%10;
            x=x/10;
            b=b*10+a;
        }
        if(b==l){
            System.out.println("1");
        }
        else System.out.println("0");
    }
}
