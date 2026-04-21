import java.util.Scanner;
public class MaxAreaOfIsland {
    static int c=0;
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static int m=sc.nextInt();
    static boolean seen[][]=new boolean[n][m];
    public static void main(String[] args) {
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    ans=Math.max(ans,checkArea(a,i,j));
                }
            }
        }
        System.out.println(ans);
    }
    static int checkArea(int a[][],int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || seen[i][j] || a[i][j]==0){
            return 0;
        }
        seen[i][j]=true;
        return 1+checkArea(a,i,j-1)+checkArea(a,i,j+1)+checkArea(a,i-1,j)+checkArea(a,i+1,j);
    }
}
