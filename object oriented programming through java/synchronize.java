class patient
{
    synchronized public void heartsurgeon()
    {
        System.out.println("processing heart surgery");
        try{Thread.sleep(100);}
        catch(InterruptedException e){}
        System.out.println("completed");
    }
    synchronized public void lungsurgeon()
    {
        System.out.println("processing lung surgery");
        try{Thread.sleep(100);}
        catch(InterruptedException e){}
        System.out.println("completed");
    }
}

class heartsurgeon implements Runnable
{
    patient p;
    heartsurgeon(patient h)
    {
        p=h;
    }
    public void run()
    {
        p.heartsurgeon();
    }
}

class lungsurgeon implements Runnable
{
    patient p;
    lungsurgeon(patient l)
    {
        p=l;
    }
    public void run()
    {
        p.lungsurgeon();
    }
}

class Test
{
    public static void main(String []args)
    {
        patient p1=new patient();
        heartsurgeon h=new heartsurgeon(p1);
        lungsurgeon l=new lungsurgeon(p1);
        Thread t1=new Thread(h);
        Thread t2=new Thread(l);
        t1.start();
        t2.start();
    }
}
