public class RandomWalker 
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int x     = 0; int y  = 0; // starting location
        int dx    = 0; int dy = 0; // Initialize Step in x and y direction
        int steps = 0; // Number of steps
        int mr    = 0;  // Manhattan distance
        System.out.println("("+x+", "+y+")");
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
            System.out.println("("+x+", "+y+")");
        }
        System.out.println("steps = " + steps);
        
        
    }
}