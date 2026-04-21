import java.util.*;
class inverse
{
    // Merge two sorted subarrays arr[low .. mid] and arr[mid + 1 .. high]
    public static int mergeSort(int arr[], int low, int mid, int high)
    {
        int[] aux = new int[arr.length];
        int k = low, i = low, j = mid + 1;
        int inversionCount = 0;
        // While there are elements in the left and right runs
        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j])
            {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
                inversionCount+=mid-i+1;
                // add code to evaluate inverse count
            }
        }
        // Copy remaining elements
        while (i <= mid)
            aux[k++] = arr[i++];
        while(j<=high) //copy remaining elements of the second list at end of temp[]
            aux[k++]=arr[j++];

        // copy back to the original array to reflect sorted order
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }

        return inversionCount;
    }

    // Sort array arr [low..high] using auxiliary array aux[]
    public int mergeSort(int[] arr, int low, int high)
    {
        // Base case
        if (high == low) {   // if run size == 1
            return 0;
        }

        // find mid point
        int mid = (low+high)/2;
        int inversionCount = 0;

        // recursively split runs into two halves until run size == 1,
        // then merge them and return back up the call chain
        inversionCount+=mergeSort(arr,low,mid);
        inversionCount+=mergeSort(arr,mid+1,high);
        inversionCount+=mergeSort(arr,low,mid,high);
        // add code to split / merge left  half and evaluate inversion count
        // add code to split / merge right half and evaluate inversion count
        // add code to merge the two half runs and evaluate inversion count

        return inversionCount;
    }
}

class invCount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int n, i;
        /* Accept number of elements */
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /* Create array of n elements */
        int arr[]=new int[n];
        System.out.println("Enter "+n+" integer elements");
        for(i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        /* Accept elements */

        int[] aux = Arrays.copyOf(arr, arr.length);
        inverse ob=new inverse();
        // get inversion count by performing merge sort on arr
        System.out.println("Inversion count is "+ob.mergeSort(arr,0, arr.length - 1));
    }
}
