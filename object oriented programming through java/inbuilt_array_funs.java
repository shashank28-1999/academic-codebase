import java.util.*;
class Test{
    public static void main(String args[]){
        int a[]=new int[8];
        a[0]=14;
        a[1]=58;
        a[2]=64;
        a[3]=15;
        a[4]=2;
        a[5]=11;
        a[6]=17;
        a[7]=45;
        Arrays.sort(a);
        int x=Arrays.binarySearch(a,2);
        if(a[x]==2){
            System.out.println("true");
        }
    }
}
