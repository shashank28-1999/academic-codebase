import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='0'){
                a[i]='1';
            }
            else{
                a[i]='0';
            }
            System.out.print(a[i]);
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--){
            if(a[i]=='0'){
                a[i]='1';
                break;
            }
            if(a[i]=='1'){
                a[i]='0';
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
