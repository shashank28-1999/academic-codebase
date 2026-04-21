import java.util.*;

class Unique
{
    String str;
    boolean b=false;
    Scanner s;
    int c;
    Unique(){
        s=new Scanner(System.in);
        str=s.next();
    }
    void check(){
        for(int i=0;i<str.length();i++){
            c=0;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    c=1;
                }
            }
        }
        if(c==1){
            System.out.println("String contains duplicate characters");
        }
        else{
            System.out.println("String contains unique characters");
        }
    }
}

class Test
{
    public static void main(String[] args)
    {
        Unique u=new Unique();
        u.check();
    }
}
