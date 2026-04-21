import java.util.*;
class prog2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        Arrays.sort(a);
        System.out.println(a[s.length()-1]);
    }
}
