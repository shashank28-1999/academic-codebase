import java.util.*;
class program3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String a[]=s.split(";");
        HashMap<String,String> m=new HashMap<String,String>();
        for(int i=0;i<a.length;i++){
            String x[]=a[i].split(":");
            m.put(x[0],x[1]);
        }
        if(m.containsKey(t)){
            System.out.println(m.get(t));
        }
        else{
            System.out.println("-1");
        }
    }
}
