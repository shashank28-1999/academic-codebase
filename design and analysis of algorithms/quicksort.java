import java.util.*;
class Quicksort
{
    void swap (int a[], int left, int right)
    {
        int t;
        t=a[left];
        a[left]=a[right];
        a[right]=t;
        //add code here... to swap elements
    } //end swap

    void quicksort( int a[], int low, int high )
    {
        int x;
        if(low<high){
            x=partition(a,low,high);
            quicksort(a,low,x-1);
            quicksort(a,x+1,high);
        }
        // add code-here... to sort (use recursion)

        //call partition()

        // ..add code-here... to sort left-part of pivot item (use recursion)

        // ...add code-here... to sort right-part of pivot item (use recursion)

    } //end quicksort

    int partition( int a[], int low, int high )
    {
        //add code here....
        int x=a[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<high && x>a[i])
                i++;
            while(x<a[j])
                j--;
            if(i<j)
                swap(a,i,j);
            else
                swap(a,low,j);
        }
        return j;
    }

    void printArray(int a[], int n)
    {
        int i;
        for (i=0; i < n; i++)
            System.out.print(" "+a[i]);
    }
}

public class QuicksortTest
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner( System.in );

        int n, i;
        /* Accept number of elements */
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /* Create array of n elements */
        int arr[] = new int[n];
        /* Accept elements */
        System.out.println("\nEnter " + n + " integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /* Call method sort */
        Quicksort ob = new Quicksort();
        ob.quicksort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        ob.printArray(arr,n);
    }
}
