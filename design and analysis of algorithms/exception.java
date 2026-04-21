import java.util.*;

class DivideByZeroException extends Exception
{
    DivideByZeroException()
    {
        super("Error: Division by zero is not allowed!");
    }
}

class ExceptionDemo
{
    int divide(int a, int b) throws DivideByZeroException
    {
        if (b == 0)
            throw new DivideByZeroException();
        return a / b;
    }
}

class ExceptionTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        ExceptionDemo obj = new ExceptionDemo();
        try
        {
            int result = obj.divide(a, b);
            System.out.println("Result of " + a + " / " + b + " = " + result);
        }
        catch (DivideByZeroException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally
        {
            System.out.println("Program execution complete.");
        }
    }
}
