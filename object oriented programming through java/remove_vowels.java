import java.util.*;
class RemVowel
{
    String s;
    int c;
    RemVowel(){
        Scanner sc=new Scanner(System.in);
        s=sc.next();
    }
    String removeVowel(){
        String r="";
        for(int i=0;i<s.length();i++){
            c=0;
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
               s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                c=1;
            }
            if(c==0){
                r=r+s.charAt(i);
            }
        }
        return r;
    }
    //declare and read required variables
    //use removeVowel() method inorder to perform the logic and return the value
}
public class Test
{
    public static void main(String args[])
    {
        RemVowel r=new RemVowel();
        String strNew;
        strNew=r.removeVowel();
        System.out.print(strNew);
    }
}
