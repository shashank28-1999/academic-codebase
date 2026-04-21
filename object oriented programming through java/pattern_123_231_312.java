import java.util.*;
class Pattern{
    void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern p=new Pattern();
        p.pattern(n);
    }
}
