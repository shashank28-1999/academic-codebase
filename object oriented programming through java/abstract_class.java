import java.util.*;
abstract class Plan{
    int units;
    double rate;
    abstract void getRate(double a);
    abstract void getUnits(int b);
        void calculateBill(){
            double c;
            c=units*rate;
            System.out.println(c);
        }
}

class commercialPlan extends Plan{
    void getRate(double a){
        rate=a;
    }
    void getUnits(int a){
        units=a;
    }
}

class domesticPlan extends Plan{
    void getRate(double a){
        rate=a;
    }
    void getUnits(int a){
        units=a;
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        Plan p=new commercialPlan();
        p.getRate(5.21);
        p.getUnits(u);
        p.calculateBill();
        Plan q=new domesticPlan();
        q.getRate(2.64);
        q.getUnits(u);
        q.calculateBill();
    }
}
