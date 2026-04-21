import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        String b[]=new String[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.next();
        }
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i].equals(a[j])){
                    a[j]+=c;
                    c++;
                }
            }
            System.out.println(a[i]);
        }
    }
}
