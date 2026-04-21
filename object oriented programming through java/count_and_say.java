import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=1;
        int n=sc.nextInt();
        System.out.println(c);
        for(int i=2;i<=n;i++){
            c=next(c);
            System.out.println(c);
        }
    }
    public static int next(int x){
        String s=""+x;
        String t="";
        for(int i=0;i<s.length();i++){
            t=t+s.charAt(i)+nooftimes(s,s.charAt(i),i);
            if(nooftimes(s,s.charAt(i),i)>1){
                i=i+nooftimes(s,s.charAt(i),i)-1;
            }
        }
        return Integer.parseInt(t);
    }
    public static int nooftimes(String s,char a,int j){
        int c=0;
        for(int i=j;i<s.length();i++){
            if(s.charAt(i)==a){
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}
