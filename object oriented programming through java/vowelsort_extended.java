import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
            t=t+convert(a[i])+" ";
        }
        System.out.println(t);
    }
    static String convert(String a){
        String b="";
        String c="";
        String d="";
        String x="";
        String y="";
        String z="";
        String w="";
        String e="";
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ||
                   a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U'){
                    b=b+a.charAt(i);
                }
                else{
                    c=c+a.charAt(i);
                }
            }
            else{
                if(Character.isDigit(a.charAt(i))){
                    d=d+a.charAt(i);
                }
                else{
                    e=e+a.charAt(i);
                }
            }
        }
        x=sort(b);
        y=sort(c);
        z=sort(d);
        w=sort(e);
        return x+y+z+w;
    }
    static String sort(String s){
        char a[]=s.toCharArray();
        String t="";
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            t=t+a[i];
        }
        return t;
    }
}
