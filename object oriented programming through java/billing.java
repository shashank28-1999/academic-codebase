import java.util.*;
class program2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int catCount[]=new int[26];
        char category[]=s.toCharArray();
        int a[]=new int[26];
        for(int i=0;i<26;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<category.length;i++){
            catCount[category[i]-'A']++;
        }
        for(int i=0;i<26;i++){
            if(catCount[i]>0){
                sum=sum+(catCount[i]/3*2+catCount[i]%3)*a[i];
            }
        }
        System.out.println(sum);
    }
}
