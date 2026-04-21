import java.util.*;
class Program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
        for(int i=0;i<a.length;i++){
            tm.put(a[i],wordCount(a[i],a));
        }
        System.out.println(tm);
    }
    static int wordCount(String x,String[] y){
        int c=0;
        for(int i=0;i<y.length;i++){
            if(y[i].equals(x)){
                c++;
            }
        }
        return c;
    }
}
