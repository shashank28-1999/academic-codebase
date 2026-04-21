import java.util.*;
public class CastleStones {
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static int m=sc.nextInt();
    static int a[]=new int[m];
    static ArrayList<Integer> al=new ArrayList<>();
    public static void main(String[] args)  {
        /* write your code here */
        int s=0;
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
            al.add(a[i]);
        }
        s=stone();
        System.out.println(s);
    }
    static int stone(){
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(a[i]+a[j]==n && al.contains(a[i]) && al.contains(a[j])){
                    c++;
                    al.remove(new Integer(a[i]));
                    al.remove(new Integer(a[j]));
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(a[i]+a[j]<n && al.contains(a[i]) && al.contains(a[j])){
                    c++;
                    al.remove(new Integer(a[i]));
                    al.remove(new Integer(a[j]));
                }
            }
        }
        return c+al.size();
    }
}
