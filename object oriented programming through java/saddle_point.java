import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rmin[] = new int[row];
        int cmax[] = new int[col];
        for(int i=0;i<row;i++){
            rmin[i] = matrix[i][0];
            for(int j=0;j<col;j++){
                if(rmin[i]>matrix[i][j]){
                    rmin[i] = matrix[i][j];
                }
            }
        }
        for(int j=0;j<col;j++){
            cmax[j] = matrix[0][j];
            for(int i=0;i<row;i++){
                if(cmax[j]<matrix[i][j]){
                    cmax[j] = matrix[i][j];
                }
            }
        }
        int flag=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rmin[i]==matrix[i][j]){
                    if(cmax[j]==rmin[i]){
                        System.out.println(rmin[i]);
                        flag=1;
                        break;
                    }
                }
            }
            if( flag==1){
                break;
            }
        }
        if(flag==0){
            System.out.println("-1");
        }
    }
}
