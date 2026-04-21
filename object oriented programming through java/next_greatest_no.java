import java.util.*;
class NextGreaterElement
{
    void printNGE(int a[],int n){
        int c;
        for(int i=0;i<n;i++){
            c=-1;
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    c=a[j];
                    break;
                }
            }
            System.out.println(a[i] + "->" + c);
        }
    }
    //use printNGE(...) method, and write necessary code
}
class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        NextGreaterElement nge=new NextGreaterElement();
        nge.printNGE(arr, n);
    }
}
