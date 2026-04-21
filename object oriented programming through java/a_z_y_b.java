import java.util.*;
class Test{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t="";
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            t=t+(char)('z'-a+'a');
        }
        System.out.println(t);
    }
}
