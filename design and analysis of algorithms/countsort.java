import java.util.*;
public class CountingSort
{
    int[] c;

    public int[] sort(int[] a, int k)
    {
        //add code here to sort the elements using countsort
        int arr[]=new int[k];
        int pos;
        int result[]=new int[a.length];
        int i;
        for(i=0;i<a.length;i++)
        {
            arr[a[i]]++;
        }
        for(i=1;i<k;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        for(i=0;i<a.length;i++)
        {
            pos=arr[a[i]];
            result[pos-1]=a[i];
            arr[a[i]]--;
        }
        return result;
    }

    void printArray(int k[])
    {
        //add code here to print the array elements
        int i;
        for(i=0;i<k.length;i++)
            System.out.print(k[i]+" ");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements of an array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max=0;
        CountingSort in=new CountingSort();
        for(int i=0;i<n;i++)
        {
            //add code here to find the max element from the array
            if(arr[i]>max)
                max=arr[i];
        }
        int result[]=in.sort(arr,max+1);
        //add code here to invoke sort method with arr[] and max element
        //store the result in result[]
        System.out.println("after sorting");
        in.printArray(result);
    }
}
