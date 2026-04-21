import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.nextLine();
        int c=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c++;
            }
        }
        System.out.println(c);
    }
}
