import java.util.*;
class Pattern
{
    int n;
    Pattern(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void print(){
        if(n>0){
            for(int i=1;i<=n;i++){
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("-1");
        }
    }
    //declare and read required variables
    //use print() to print the required pattern.
}
class Test
{
    public static void main(String args[])
    {
        Pattern p=new Pattern();
        p.print();
    }
}
