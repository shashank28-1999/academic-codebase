import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n,x=n,z=0,c=0;
        while(l>0){
            l=l/10;
            z++;
        }
        for(int i=0;i<z;i++){
            x=n;
            int m=x%(int)(Math.pow(10,i));
            x=x/(int)(Math.pow(10,i));
            int y=m*(int)(Math.pow(10,z-i))+x;
            if(isPrime(y)){
                c++;
            }
        }
        if(c==z){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean isPrime(int x){
        boolean b=true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                b=false;
                break;
            }
        }
        return b;
    }
}
