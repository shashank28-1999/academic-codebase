import java.util.*;

// Shared object to hold the current random number
class SharedNumber
{
    int number = 0;
    boolean newNumberReady = false;
}

// Thread 1: Generates a random integer every 1 second
class GeneratorThread extends Thread
{
    SharedNumber shared;

    GeneratorThread(SharedNumber shared)
    {
        this.shared = shared;
    }

    public void run()
    {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) // generates 5 numbers then stops
        {
            synchronized (shared)
            {
                shared.number         = rand.nextInt(20) + 1;
                shared.newNumberReady = true;
                System.out.println("\nThread 1 (Generator) -> Generated: " + shared.number);
                shared.notifyAll();
            }
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

// Thread 2: Computes and prints the square
class SquareThread extends Thread
{
    SharedNumber shared;

    SquareThread(SharedNumber shared)
    {
        this.shared = shared;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            synchronized (shared)
            {
                while (!shared.newNumberReady)
                {
                    try { shared.wait(); }
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                long sq = (long) shared.number * shared.number;
                System.out.println("Thread 2 (Square)    -> Square of " + shared.number + " = " + sq);
            }
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

// Thread 3: Computes and prints the cube
class CubeThread extends Thread
{
    SharedNumber shared;

    CubeThread(SharedNumber shared)
    {
        this.shared = shared;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            synchronized (shared)
            {
                while (!shared.newNumberReady)
                {
                    try { shared.wait(); }
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                long cb = (long) shared.number * shared.number * shared.number;
                System.out.println("Thread 3 (Cube)      -> Cube of  " + shared.number + " = " + cb);
                shared.newNumberReady = false; // reset for next cycle
            }
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class MultiThreadTest
{
    public static void main(String args[]) throws InterruptedException
    {
        SharedNumber shared = new SharedNumber();

        GeneratorThread t1 = new GeneratorThread(shared);
        SquareThread    t2 = new SquareThread(shared);
        CubeThread      t3 = new CubeThread(shared);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nAll threads finished.");
    }
}
