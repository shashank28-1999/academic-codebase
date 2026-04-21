import java.util.*;
class Test{
    public static int getmin(ArrayList<Integer> lis){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<lis.size();i++){
            if(lis.get(i)<min){
                min=lis.get(i);
            }
        }
        return min;
    }
    public static ArrayList<Integer> remo(ArrayList<Integer> lis1){
        int j=0;
        while(lis1.size()!=0){
            if(lis1.contains(0)){
                lis1.remove(new Integer(0));
            }
            else{
                break;
            }
        }
        return lis1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer> lis =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            lis.add(a[i]);
        }
        ArrayList<Integer> lis1 =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            lis1=remo(lis);
            int min=getmin(lis1);
            for(int k=0;k<lis1.size();k++){
                lis1.set(k,(lis1.get(k)-min));
            }
            if(lis1.size()>0)
                System.out.println(lis1.size());
        }
    }
}
