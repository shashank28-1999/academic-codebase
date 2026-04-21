import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max1=0,max2=0,flag=0;
        LinkedHashMap<Character,Integer> x=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(x.containsKey(c)){
                int v=x.get(c);v++;
                if(v>max1){
                    max1=v;
                }
                x.put(c,v);
            }
            else{
                x.put(c,1);
            }
        }
        Set<Character> keys=x.keySet();
        for(Character p:keys){
            if(x.get(p)>max2 && x.get(p)!=max1){
                max2=x.get(p);
            }
        }
        for(Character p:keys){
            if(x.get(p)==max2){
                flag++;
                System.out.println(p);
            }
        }
        if(flag==0) System.out.println("-1");
    }
}
