import java.util.*;
class Test{
    static ArrayList<Integer> al=new ArrayList<>();
    static ArrayList<Stack<Integer>> alt=new ArrayList<>();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num="";
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n>50 || m<1 && (n<1 || n>20)){
            System.out.println("-1");
            return;
        }
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            al.add(input(a,i,m));
        }
        while(al.isEmpty()==false){
            for(int i=0;i<al.size();i++){
                alt.add(al.get(i).peek());
            }
            num=getMax(alt);
            System.out.println(num);
        }
    }
    public static Stack<Integer> input(int a[][],int x,int y){
        Stack<Integer> st=new Stack<>();
        for(int j=0;j<y;j++){
            st.push(a[x][j]);
        }
        return st;
    }
    public static int getMax(ArrayList<Integer> al1){
        Collections.sort(al1);
        int x=al1.get(al1.size()-1);
        for(int i=0;i<al1.size();i++){
            if(al1.get(i).peek()==x){
                al1.get(i).pop();
                nonempty();
                break;
            }
        }
        alt.clear();
        return x;
    }
    public static void nonempty(){
        for(int i=0;i<al.size();i++){
            if(al.get(i).isEmpty()){
                al.remove(al.get(i));
            }
        }
    }
}
