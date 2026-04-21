import java.util.*;
class Sort
{
    void sort(int a[], int low, int high)
    {
        if(low<high){
            int mid=(low+high)/2;
            sort(a,low,mid);
            sort(a,mid+1,high);
            merge(a,low,mid,mid+1,high);
        }
        //write the code to sort elements
    }

    void merge(int a[], int low1, int high1, int low2, int high2)
    {
        int temp[]=new int[high2+1];
        int i=low1, j=low2, count=low1;
        while(i<=high1 && j<=high2){
            if(a[i]<a[j]){
                temp[count]=a[i];
                i++;
                count++;
            }
            else{
                temp[count]=a[j];
                j++;
                count++;
            }
        }
        if(i>high1){
            while(j<=high2){
                temp[count]=a[j];
                count++;
                j++;
            }
        }
        if(j>high2){
            while(i<=high1){
                temp[count]=a[i];
                count++;
                i++;
            }
        }
        for(int k=low1;k<=high2;k++){
            a[k]=temp[k];
        }
        //add code here
    }

    void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); //add code here
        }
    }
}

class Merge
{
    public static void main(String args[])
    {
        // create Scanner class object
        System.out.println("Merge Sort Test\n");
        int n, i;

        /* Accept number of elements */
        System.out.println("Enter number of integer elements");
        //Use Scanner object to read no of elements in variable 'n' declared above
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        /* Create array of n elements */
        int arr[] = new int[ n ];

        /* Accept elements */
        System.out.println("\nEnter " + n + " integer elements");
        for (i = 0; i < n; i++){
            //use Scanner object and method to read elements in arr[]
            arr[i]=sc.nextInt();
        }
        /* Call method sort */
        Sort ob = new Sort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        ob.printArray(arr);
    }
}
