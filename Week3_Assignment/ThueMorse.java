public class ThueMorse
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int[] thue = new int[2*n+1];
        thue[0] = 0;
        // use ther recursion formula for generating the Thue-Morse sequence
        for (int i = 0; i < n ; i++)
        {
            thue[2 * i ] = thue[i];
            thue[2 * i + 1] = 1 - thue[i] ;
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (thue[i] == thue[j]) 
                {
                    System.out.print("+"+ "  ");
                    if (j == n-1) 
                        { System.out.println(); }
                } 
                else 
                {
                    System.out.print("-"+ "  ");
                    if (j == n-1) 
                        { System.out.println(); }
                }
    }
}