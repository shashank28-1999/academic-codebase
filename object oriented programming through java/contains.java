import java.util.*;
class program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String lowl = l.toLowerCase();
        String r = sc.next();
        String lowr = r.toLowerCase();
        String arr[] = lowl.split(" ");
        int flag=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<lowr.length();j++){
                if(arr[i].contains(Character.toString(lowr.charAt(j)))){
                    count = count+1;
                }
            }
            if(count==lowr.length()){
                flag=flag+1;
                System.out.println(arr[i]);
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
}
