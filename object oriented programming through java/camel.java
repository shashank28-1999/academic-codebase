import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int c=-1;
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String b=sc.nextLine();
            al.add(b);
        }
        String wakeup=sc.next();
        String s=sc.next();
        String f=sc.next();
        int t=sc.nextInt();
        int shopping=sc.nextInt();
        String w[]=wakeup.split(":");
        String shop[]=s.split(":");
        String feed[]=f.split(":");
        int feeding=toNumber(feed[0])*toNumber(feed[1]);
        for(int i=0;i<n;i++){
            String a[]=getTime(al.get(i));
            String b[]=endTime(al.get(i));
            int start=60*toNumber(a[0])+toNumber(a[1]);
            int end=60*toNumber(b[0])+toNumber(b[1]);
            if(shoppingTime(w,shop,t,shopping)<start && feeding<end){
                c=i+1;
                break;
            }
        }
        System.out.println(c);
    }
    public static String[] getTime(String x){
        String a[]=x.split(" ");
        String b[]=a[0].split(":");
        return b;
    }
    public static String[] endTime(String x){
        String a[]=x.split(" ");
        String b[]=a[1].split(":");
        return b;
    }
    public static int shoppingTime(String w[],String s[],int t,int shopping){
        int wakeUp=60*toNumber(w[0])+toNumber(w[1]);
        int shop=60*toNumber(s[0])+toNumber(s[1]);
        int x=t+shopping+shop;
        return x;
    }
    public static int toNumber(String x){
        return Integer.parseInt(x);
    }
}
