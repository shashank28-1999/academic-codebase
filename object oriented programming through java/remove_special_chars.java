import java.util.*;

class RemDigSym
{
    String src="";
    String res="";
    Scanner s;
    RemDigSym(){
        s=new Scanner(System.in);
        src=s.nextLine();
    }
    void process(){
        for(int i=0;i<src.length();i++){
            if((src.charAt(i)>='A' && src.charAt(i)<='Z')||(src.charAt(i)>='a' && src.charAt(i)<='z')){
                res=res+src.charAt(i);
            }
        }
        System.out.println(res);
    }
}

public class Test
{
    public static void main(String[] args)
    {
        RemDigSym r= new RemDigSym();
        r.process();
    }
}
