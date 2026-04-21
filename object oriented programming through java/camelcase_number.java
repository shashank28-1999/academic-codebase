import java.util.*;
class Camel{
    void Case(int n){
        int c=1;
        String s="";
        s=s+n;
        if(s.length()==1){
            System.out.println("Camel Case");
            return;
        }
        for(int i=1;i<s.length();i++){
            c=0;
            if(s.charAt(0)>s.charAt(i)){
                c++;
            }
        }
        if(c==s.length()){
            System.out.println("Camel Case");
        }
        else{
            System.out.println("Not Camel Case");
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Camel cam=new Camel();
        cam.Case(n);
    }
}
