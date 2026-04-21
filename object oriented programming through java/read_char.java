import java.util.*;
class program2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char x=sc.next().charAt(0);
        int c=0;
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i)==x){
                c++;
            }
        }
        if(c!=0)
        System.out.println(c);
        else
        System.out.println("-1");
    }
}
