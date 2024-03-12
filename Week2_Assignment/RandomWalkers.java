public class RandomWalkers 
{
    public static void main(String[] args)
    {
        int r            = Integer.parseInt(args[0]);
        int trials       = Integer.parseInt(args[1]);
        double sum_steps = 0;
        for (int i = 1; i <= trials; i++) 
        {
            int x     = 0; int y  = 0; // starting location
            int dx    = 0; int dy = 0; // Initialize Step in x and y direction
            int steps = 0; // Number of steps
            int mr    = 0;  // Manhattan distance
            while (mr < r) 
            {
                // pick a random step in either of the 4 directions
                double t = Math.random();
                if (t < 0.25) {dx = 1; dy=0;}
                else if (t >= 0.25 && t < 0.5) {dx = -1; dy=0;}
                else if (t >= 0.5 && t < 0.75) {dx = 0; dy=1;}
                else if (t >= 0.75) {dx = 0; dy=-1;}
                // update the location
                x = x + dx;
                y = y + dy;
                steps = steps + 1;
                mr = Math.abs(x) + Math.abs(y);
            }
            sum_steps += steps;
        }
        System.out.println("average number of steps = " + sum_steps/trials);
    }
}