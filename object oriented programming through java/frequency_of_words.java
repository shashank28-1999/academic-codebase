import java.util.*;
class Test{
    public static void main(String args[]){
        String s=new String("It has four departments and four buildings");
        String a[]=s.split(" ");
        System.out.println(s);
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(j<i && a[i].equals(a[j])){
                    break;
                }
                if(a[i].equals(a[j])){
                    c++;
                }
                if(j==a.length-1){
                    System.out.println(a[i]+" "+c);
                }
            }
        }
    }
}
