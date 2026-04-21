public class Nqueens
{
    final int N=8;

    /* A utility function to print solution */
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }

    /* A utility function to check if a queen can
    be placed on board[row][col]. Note that this
    function is called when "col" queens are already
    placed in columns from 0 to col-1. So we need
    to check only left side for attacking queens */
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;

        //add code here according to the comments given below.....

        /* Check this row on left side */
        for(i=0;i<col;i++)
        {
            if(board[row][i]==1)
                return false;
        }

        /* Check upper diagonal on left side */
        for(i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }

        /* Check lower diagonal on left side */
        for(i=row,j=col;i<N&&j>=0;i++,j--)
        {
            if(board[i][j]==1)
                return false;
        }

        return true;
    }

    /* A recursive utility function to solve N
    Queen problem */
    boolean solveNQUtil(int board[][], int col)
    {
        //add code here according to the comments given below.....

        /* base case: If all queens are placed
        then return true */
        if(col>=N)
            return true;

        /* Consider this column and try placing
        this queen in all rows one by one */
        for(int i=0;i<N;i++)
        {
            if(isSafe(board,i,col))
            {
                board[i][col]=1;
                if(solveNQUtil(board,col+1))
                    return true;
                board[i][col]=0;

                /* Check if queen can be placed on
                board[i][col] */

                /* Place this queen in board[i][col] */

                /* recur to place rest of the queens */

                /* If placing queen in board[i][col]
                doesn't lead to a solution then
                remove queen from board[i][col] */

                // BACKTRACK
            }
        }

        /* If queen can not be place in any row in
        this colum col, then return false */
        return false;
    }

    /* This function solves the N Queen problem using
    Backtracking. It mainly uses solveNQUtil() to
    solve the problem. It returns false if queens
    cannot be placed, otherwise return true and
    prints placement of queens in the form of 1s.
    Please note that there may be more than one
    solutions, this function prints one of the
    feasible solutions.*/
    boolean solveNQ()
    {
        int board[][] = new int[N][N];

        //intialize board[][] with zeros
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                board[i][j]=0;

        if (solveNQUtil(board, 0) == false)
        {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }
}

class NqueensTest
{
    public static void main(String args[])
    {
        Nqueens obj= new Nqueens();
        System.out.println("one of the solution for 8-queens problem is");
        obj.solveNQ();
    }
}
