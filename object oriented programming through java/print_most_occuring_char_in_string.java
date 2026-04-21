import java.util.*;
class MaxOccuranceChar
{
    final int ASCII_SIZE = 256;
    char getMaxOccuringChar(String str)
    {
        int arr[]=new int[ASCII_SIZE];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
            char c=' ';
            int j=-1;
            for(int i=0;i<str.length();i++){
                if(j<arr[str.charAt(i)]){
                    j=arr[str.charAt(i)];
                    c=str.charAt(i);
                }
            }
        return c;
        //write the required logic here and return the value
    }
}
class Test
{
    public static void main(String[] args)
    {
        MaxOccuranceChar m=new MaxOccuranceChar();
        Scanner s=new Scanner(System.in);
        String str = s.next();
        System.out.println(m.getMaxOccuringChar(str));
    }
}
