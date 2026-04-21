import java.util.*;
class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Test t=new Test();
        t.print(s);
    }
}
class Test{
    void print(String s){
        String b="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                b=b+"V";
            }
            else{
                b=b+"C";
            }
        }
        for(int j=0;j<10;j++){
            b=b.replace("CC","C");
            b=b.replace("VV","V");
        }
        System.out.println(b);
    }
}
