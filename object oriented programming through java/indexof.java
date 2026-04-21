import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char x[]=s1.toCharArray();
        char y[]=s2.toCharArray();
        String t="";
        String h="";
        for(char i:x){
            if(t.indexOf(i)==-1){
                t=t+i;
            }
        }
        for(char i:y){
            if(h.indexOf(i)==-1){
                h=h+i;
            }
        }
        if(t.length()!=h.length()){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
    }
}
