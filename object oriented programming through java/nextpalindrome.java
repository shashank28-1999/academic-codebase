import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n+1;
        System.out.println(NextPalindrome(x));
    }
    static int NextPalindrome(int n){
        int x=0;
        for(int i=n;i<n*10;i++){
            if(palindrome(i)){
                x=i;
                break;
            }
        }
        return x;
    }
    static boolean palindrome(int n){
        int b=0,m=n;
        while(n>0){
            int a=n%10;
            n=n/10;
            b=b*10+a;
        }
        if(b==m){
            return true;
        }
        return false;
    }
}
