import java.util.*;
class program2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        String b="";
        String c="";
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            b=b+a[i];
        }
        for(int i=0;i<a.length;i++){
            c=c+a[i];
        }
        System.out.println(c);
        System.out.println(b);
    }
}
