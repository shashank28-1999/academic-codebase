import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String b="";
        int c=0,f=0;
        for(int i=0;i<s.length();i++){
            c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
                if(j==s.length()-1){
                    if(c>1){
                        b=b+s.charAt(i);
                    }
                    else{
                        f++;
                    }
                }
            }
        }
        if(f==s.length()){
            System.out.println("-1");
        }
        else{
            System.out.println(b);
        }
    }
}
