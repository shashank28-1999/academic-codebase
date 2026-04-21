import java.util.*;
class program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String words[] = input.split(" ");
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<String> as = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(sb.length()>0){
                sb.delete(0,sb.length());
            }
            sb.append(words[i]);
            sb.reverse();
            //System.out.println(sb.toString());
            if(words[i].equals(sb.toString())){
                al.add(words[i].length());
                as.add(words[i]);
            }
        }
        if(al.isEmpty()){
            System.out.println("null");
        }
        else{
            Collections.sort(al);
            int max = al.get(al.size()-1);
            for(String s :as){
                if(s.length()==max){
                    System.out.print(s+" ");
                }
            }
        }
    }
}
