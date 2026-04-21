import java.util.*;
class Factor{
    void primeFactors(int a,int b){
        int c=0;
        for(int i=2,j=2;i<a && j<b;i++,j++){
            if(a%i==0 && b%j==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Factor f=new Factor();
        f.primeFactors(a,b);
    }
}
