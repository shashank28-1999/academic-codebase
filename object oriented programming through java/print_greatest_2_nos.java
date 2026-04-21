import java.util.*;
class TwoMaxNumbers {
    void printTwoMaxNumbers(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(a[0]+" "+a[1]);
    }
    //use printTwoMaxNumbers(..) method, inorder to write the required logic
}
class Test
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        //Read elements into array here
        TwoMaxNumbers t = new TwoMaxNumbers();
        t.printTwoMaxNumbers(a);
    }
}
