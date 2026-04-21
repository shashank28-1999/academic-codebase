import java.util.*;

class BubbleSort
{
    void bubbleSort(int a[], int n)
    {
        int i, j, temp;
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    // swap a[j] and a[j+1]
                    temp    = a[j];
                    a[j]    = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

class BubbleSortTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integer elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr, n);

        System.out.println("Sorted array:");
        ob.printArray(arr, n);
    }
}
