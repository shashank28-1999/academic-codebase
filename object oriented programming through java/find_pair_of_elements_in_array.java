import java.util.*;
class PairsOfElementsInArray
{
    void findThePairs(int arr[],int x){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int c=arr[i]+arr[j];
                if(c==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    flag=true;
                }
            }
        }
        if(!flag){
            System.out.println("-1");
        }
    }
    //use findThePairs(...), write the required logic here
}
class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        //decalre required variables and read values to them.
        PairsOfElementsInArray p=new PairsOfElementsInArray();
        p.findThePairs(array, sum);
    }
}
