import java.util.*;
class program2
{
    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int stick=0;
        int [] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a.length);
        for (int i = 1; i < n; i++)
        {
            if (a[i] != a[i-1])
            {
                System.out.println(n - i);
            }
        }
    }
}
