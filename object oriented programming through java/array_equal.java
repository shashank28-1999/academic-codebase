import java.util.*;
class Anagram{
    String s,t;
    int c=0;
    Anagram(String a,String b){
        s=a;
        t=b;
    }
    int check(){
        char x[]=s.toCharArray();
        char y[]=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Anagram a=new Anagram(s1,s2);
        int x=a.check();
        System.out.println(x);
    }
}
