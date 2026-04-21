import java.util.*;
class NumberPattern
{
    void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    //use printPattern(), Write the required logic to print the pattern
}
class Test
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        NumberPattern np=new NumberPattern();
        np.printPattern(n);
    }
}
