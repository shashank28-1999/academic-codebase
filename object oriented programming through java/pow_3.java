import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n;
        int i=1;
        while(l!=0){
            if(l%3==0){
                i*=3;
            }
            l=l/3;
        }
        if(i==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
