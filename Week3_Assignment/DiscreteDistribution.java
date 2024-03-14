public class DiscreteDistribution
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = Integer.parseInt(args[i+1]);
        }
        // define the cumulutive sums array
        int[] S = new int[n+1];
        S[0] = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < i; j++)
        {
            S[i] += a[j];
        }
        int flag = 0;
        while (flag < m)
        {
            // pick a random integer r uniformly between 0 and S[n] - 1
            int r = (int)(Math.random() * (S[n] -1) );
            for (int i = 1; i <= n; i++)
                if ( (S[i-1] <= r) && (r < S[i]))
            {
                System.out.print(i+" ");
                flag += 1;
            }            
        }
        System.out.println();
    }
}