import java.util.*;
class Ngreeter implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("welcome to ngit");
        }
    }
}
class Test{
    public static void main(String args[]){
        Ngreeter n=new Ngreeter();
        Thread t1=new Thread(n);
        t1.run();
    }
}
