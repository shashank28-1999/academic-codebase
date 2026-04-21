import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String b="";
        int x=sc.nextInt();
        String a[]=s.split(" ");
        if(x>a.length){
            System.out.println("-1");
            return;
        }
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            if(i==x){
                b=b+a[i];
            }
            else{
                al.add(a[i]);
            }
        }
        Collections.sort(al);
        al.add(x,b);
        for(String i:al){
            System.out.print(i+" ");
        }
    }
}
