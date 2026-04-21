import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String b="";
        String a[]=s.split(" ");
        ArrayList<String> al=new ArrayList<String>();
        for(String i:a){
            al.add(i);
        }
        for(String i:al){
            if(b.contains(i)==false){
                b=b+i+" ";
            }
        }
        System.out.println(b);
    }
}
