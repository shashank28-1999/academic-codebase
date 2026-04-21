import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.nextLine();
        int i=sc.nextInt();
        int j=sc.nextInt();
        String t=s.substring(i,j);
        System.out.println(t);
    }
}
