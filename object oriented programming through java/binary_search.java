import java.util.*;
class BinSearch
{
    int mid;
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l){
            mid = l+(r - l)/2;
            if (arr[mid] == x)
        return mid;
            if (arr[mid] > x)
        return binarySearch(arr, l, mid-1, x);

        return binarySearch(arr, mid+1, r, x);
        }
    return -1;
    }
}
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        BinSearch bs=new BinSearch();
        System.out.println(bs.binarySearch(arr,0,n-1,x));
    }
}
