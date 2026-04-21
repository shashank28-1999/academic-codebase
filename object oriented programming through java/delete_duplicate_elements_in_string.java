import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        String s=sc.nextLine();
        String t=new String();
        for(int i=0;i<s.length();i++){
            c=0;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    c=1;
                }
            }
            if(c==0){
                t=t+s.charAt(i);
            }
        }
        for(int i=0;i<t.length();i++){
            System.out.print(t.charAt(i));
        }
    }
}
