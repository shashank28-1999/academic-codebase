import java.util.*;
class prog{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int x=0;
        char a[]=s.toCharArray();
        for(int i=1;i<a.length;i++){
            if(a[0]<a[i]){
                x=1;
                break;
            }
        }
        if(x==0){
            System.out.println("Camel Case");
        }
        else{
            System.out.println("Not Camel Case");
        }
    }
}
