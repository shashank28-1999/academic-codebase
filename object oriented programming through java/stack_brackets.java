import java.util.*;
class CheckBalance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        boolean b=false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            if(a[i]=='(' || a[i]=='{' || a[i]=='['){
                st.push(a[i]);
            }
            else{
                if(st.isEmpty()==false && a[i]==')' && st.peek()=='('){
                    st.pop();
                }
                if(st.isEmpty()==false && a[i]=='}' && st.peek()=='{'){
                    st.pop();
                }
                if(st.isEmpty()==false && a[i]==']' && st.peek()=='['){
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
