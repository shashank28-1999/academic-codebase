import java.util.*;
import java.lang.*;
public class program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();

        for(int i=0;i<7;i++){
            int n=sc.nextInt();
            list1.add(n);
        }
        int x=sc.nextInt();
        if(x<list1.get(0)){
            System.out.println(-1);
            return;
        }
        int j=0;
        for(j=0;j<7;j++){
            int c=list1.get(j);
            if(c<=x){
                continue;
            }
            else{
                break;
            }
        }
        System.out.println(j-1);
    }
}
