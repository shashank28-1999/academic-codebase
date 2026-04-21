import java.util.*;
class prorgam1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        HashSet<Integer> s=new HashSet<Integer>();
        int n=sc.nextInt();
        String x=sc.next();
        int j=0;
        int c[]=new int[n];
        String a[]= x.split(",");
        for(int i=0;i<n;i++){
            c[i]=Integer.parseInt(a[i]);
            s.add(c[i]);
        }
        int b[]=new int[s.size()];
        for(Integer i:s){
            b[j]=i;
            j++;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]+"->"+count(c,b[i]));
        }
    }
    static int count(int a[],int x){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                c++;
            }
        }
        return c;
    }
}
