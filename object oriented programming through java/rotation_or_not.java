import java.util.*;
class program1
{
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1 =sc.next();
        String str2 =sc.next();

        if (areRotations(str1, str2))
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
