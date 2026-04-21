import java.util.*;
import java.time .*;
public class FindTheNextDay {
    public static void main(String args[])  {
        try{
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String a[]=s.split("-");
            if(Integer.parseInt(a[2])<1950 && Integer.parseInt(a[2])>2050 ){
                System.out.println("Invalid Date");
            }
            LocalDate d=LocalDate.of(Integer.parseInt(a[2]),Integer.parseInt(a[1]),Integer.parseInt(a[0]));
            d=d.plusDays(1);
            String t=d+"";
            String b[]=t.split("-");
            System.out.println(b[2]+"-"+b[1]+"-"+b[0]);
        }
        catch(Exception e){
            System.out.println("Invalid Date");
        }
        /* write your code here */
    }
}
