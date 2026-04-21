import java.util.*;

class Stack
{
    int top;
    int maxSize;
    int[] arr;

    Stack(int size)
    {
        maxSize = size;
        arr     = new int[maxSize];
        top     = -1;
    }

    boolean isFull()
    {
        return top == maxSize - 1;
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    void push(int val)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow! Cannot push " + val);
            return;
        }
        arr[++top] = val;
        System.out.println(val + " pushed onto stack.");
    }

    int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return arr[top--];
    }

    void display()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class StackTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack st = new Stack(size);

        int choice, val;
        do
        {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    val = st.pop();
                    if (val != -1)
                        System.out.println("Popped: " + val);
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
