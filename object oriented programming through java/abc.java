import java.util.*;
import java.lang.*;
public class prog{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] count=new int[26];
        s=s.toLowerCase();
        if(s==" "){
            System.out.println(0);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90)) {
                int pos=s.charAt(i)-97;
                count[pos]=count[pos]+1;
            }
            else{
                continue;
            }
        }
        /*for(int i=0;i<26;i++){
            System.out.println(count[i]);
        }*/
        Arrays.sort(count);
        if(count[0]==0){
            System.out.print(0);
        }
        else
            System.out.print(1);
    }
}
