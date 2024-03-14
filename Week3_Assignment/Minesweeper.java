public class Minesweeper 
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[] x_mines = new int[k];
        int[] y_mines = new int[k];

        for (int i = 0; i < k; i++) 
        {
            x_mines[i] = (int)(Math.random() * (m - 1) );
            y_mines[i] = (int)(Math.random() * (n - 1) );
        }
        for (int x = 0; x < m; x++)
                for (int y = 0; y < n; y++) 
                {
                    for (int l = 0; l < k; l++)
                        if ((x == x_mines[l]) && (y == y_mines[l]))
                            {System.out.print("*  ");}
                        else { continue; }

                    //if ((x == x_mines[]) && (y == y_mines))
                    //    System.out.print("*  ");
                    if (x == (m -1))
                        { System.out.println(".  "); }
                    else
                    {
                        System.out.print(".  ");
                    }
                        
                }
    }
}