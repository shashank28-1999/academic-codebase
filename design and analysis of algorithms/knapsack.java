import java.util.*;
public class Knapsack
{
    void knapsack(int n, double weight[], double profit[], double capacity)
    {
        double x[]=new double[20]; double tp = 0;
        int i, j;
        double u =capacity;
        //add code here.........
        for(i=0;i<weight.length;i++){
            if(u>weight[i]){
                tp=tp+profit[i];
                u=u-weight[i];
                x[i]=weight[i]/weight[i];
            }
            else{
                x[i]=u/weight[i];
                tp=tp+u*(profit[i]/weight[i]);
                u=u-weight[i];
                break;
            }
        }
        System.out.println("The result vector is:");
        for(i=0;i<4;i++){
            System.out.println(x[i]);
        }
        System.out.println("Maximum profit is:"+tp);
    }

    public static void main(String args[])
    {
        double weight[]=new double[20];
        double profit[]=new double[20];
        int num, i, j;
        double capacity;
        double ratio[]=new double[20],temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of objects:");
        num=sc.nextInt();
        Knapsack obj=new Knapsack();
        for (i = 0; i < num; i++) {
            System.out.println("enter item "+(i+1)+" weights and profit");
            weight[i]=sc.nextDouble();
            profit[i]=sc.nextDouble();
        }
        System.out.println("Enter the capacity of knapsack:");
        capacity=sc.nextDouble();
        for (i = 0; i < num; i++) {
            ratio[i] = profit[i] / weight[i];
        }
        for (i = 0; i < num; i++) {
            for (j = i + 1; j < num; j++) {
                if (ratio[i] < ratio[j]) {
                    temp = ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp;

                    temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = temp;

                    temp = profit[j];
                    profit[j] = profit[i];
                    profit[i] = temp;
                }
            }
        }
        System.out.println("After sorting by pi/wi ratio");
        for(i=0;i<num;i++)
            System.out.println("p["+(i+1)+"]="+profit[i]+" "+"w["+(i+1)+"]="+weight[i]);
        obj.knapsack(num, weight, profit, capacity);
    }
}
