import java.util.*;
class ShortestAndLongest
{
    void findShortestAndLongest(String s){
        String a[]=s.split(" ");
        String l="";
        String sh="                ";
        for(String str:a){
            if(str.length()>l.length()){
                l=str;
            }
            if(str.length()<sh.length()){
                sh=str;
            }
        }
        System.out.println(sh);
        System.out.println(l);
    }

    //use findShortestAndLongest(...) method, to write required logic and print
}
class Test
{
    public static void main(String[] args)
    {
        ShortestAndLongest o = new ShortestAndLongest();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        o.findShortestAndLongest(str);
    }
}
