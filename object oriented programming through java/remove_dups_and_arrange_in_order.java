import java.util.*;
class RemoveDuplicateChar
{
    int c;
    char t;
    String removeDups(String s){
        String a="";
        int carray[]=new int [27];
        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            carray[t-'a']+=1;
        }
        for(int i=0;i<27;i++){
            if(carray[i]>0){
                a=a+(char)(i+'a');
            }
        }
        return a;
    }
}

class Test
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        RemoveDuplicateChar rm=new RemoveDuplicateChar();
        String str=s.next();
        System.out.println(rm.removeDups(str));
    }
}
