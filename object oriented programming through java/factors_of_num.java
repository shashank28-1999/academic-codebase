import java.util.*;
class Fact
{
    void factors(){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

class Test
{
    public static void main(String args[])
    {
        Fact f=new Fact();
        f.factors();
    }
}
