import java.util.*;
class program2
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1[]=s.split("");
        String t=sc.next();
        LinkedHashMap<String,Integer> lm=new LinkedHashMap<String,Integer>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<s1.length;i++)
        {
            if(lm.containsKey(s1[i]))
            {
                int c=lm.get(s1[i]);
                c++;
                lm.put(s1[i],c);
            }
            else
            {
                lm.put(s1[i],1);
            }
        }
        Set <String> ss=lm.keySet();
        for(String i:ss)
        {
            al.add(lm.get(i));
        }
        // System.out.println(lm);
        Collections.sort(al);
        for(int l=al.size()-1;l>=0;l--)
        {
            for(String s2:ss)
            {
                if(al.get(l)==lm.get(s2))
                {
                    for(int p=0;p<al.get(l);p++)
                    System.out.print(s2);
                    lm.put(s2,-1);
                    break;
                }
            }
        }
    }
}
