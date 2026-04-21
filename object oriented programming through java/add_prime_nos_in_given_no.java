import java.util.*;
class Digits{
    void sum(int n){
        int b=0;
        while(n>0){
            int a=n%10;
            if(prime(a)==0){
                b=b+a;
            }
            n=n/10;
        }
        System.out.println(b);
    }
    int prime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        return c;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Digits d=new Digits();
        d.sum(n);
    }
}
