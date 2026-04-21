import java.util.*;
class program1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String t[]=s.split(" ");
        int c,n,m=0;
        for(String l:t){
            c=0;
            n=0;
            for(int j=0;j<l.length();j=j+2)
            {
                char d=l.charAt(j);
                if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U')
                {
                    c++;
                }
            }
            for(int j=1;j<l.length();j=j+2)
            {
                char e=l.charAt(j);
                if(e=='a'||e=='e'||e=='i'||e=='o'||e=='u'||e=='A'||e=='E'||e=='I'||e=='O'||e=='U')
                {
                    n++;
                }
            }
            if(l.length()>2){
                if(l.length()%2==0){
                    if(c==l.length()/2||n==l.length()/2)
                    System.out.print(l+" ");
                    m++;
                }
                else{
                    if(c==l.length()/2+1||n==l.length()/2)
                    System.out.print(l+" ");
                    m++;
                }}
            if(m==0)
            System.out.println("-1");
        }
    }
}
