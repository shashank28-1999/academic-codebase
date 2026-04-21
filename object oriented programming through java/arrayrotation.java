import java.util.*;
class program3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            al.add(sc.nextInt());

        int max=0;
        for(int i=0;i<n;i++)
        {
            int sum=0,k=0;
            for(int j=0;j<n;j++,k++)
            {
                sum+=(k)*al.get(j);
            }

            if(max<sum)
                max=sum;
            int p=al.get(0);
            al.remove(0);
            al.add(p);

        }
        System.out.println(max);
    }
}
