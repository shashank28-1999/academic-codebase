import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        ArrayList<String> al1=new ArrayList<String>();
        for(int i=0;i<5;i++){
            al1.add(sc.next());
        }
        ArrayList<String> al2=new ArrayList<String>();
        for(int i=0;i<5;i++){
            al2.add(sc.next());
        }
        for(String i:al1){
            if(al2.contains(i)){
                c++;
                System.out.println(i);
            }
        }
        if(c==0){
            System.out.println("-1");
        }
    }
}
