import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int p=0,c=0,m=0,b=0,z=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='p'){
                p++;
            }
            if(a[i]=='c'){
                c++;
            }
            if(a[i]=='m'){
                m++;
            }
            if(a[i]=='b'){
                b++;
            }
            if(a[i]=='z'){
                z++;
            }
        }
        int x[]={p,c,m,b,z};
        Arrays.sort(x);
        System.out.println(x[0]);
    }
}
