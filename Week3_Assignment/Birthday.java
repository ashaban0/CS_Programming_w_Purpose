public class Birthday
{
    public static void main(String[] args)
    {
        int n              = Integer.parseInt(args[0]);
        int trials         = Integer.parseInt(args[1]);
        int people_in_room = 0;
        double fraction    = 0.0;
        double count       = 0; 
        int[] bday = new int[n];
        int b0 = (int)(Math.random() * (n-1));
        while (fraction < 0.5) 
        {
            for (int i = 0; i < trials; i++)
            {
                // choose a birthday for the next person
                int b = (int)(Math.random() * (n-1));
                count += 1;
                if (b == b0);
                {
                    break;
                } 
                //System.out.println(b + " "+ bday[b]);
                
                //if (bday[b] > 1)
                //{ 
                    //people_in_room += 1;
                //    break;
                //}
                //else 
                //{ 
                //    count += 1; 
                //}
                //count += 1;
                //System.out.println("count = "+count);
                
            }
            fraction +=  count / trials;
            people_in_room ++;
            System.out.println(people_in_room+"    " +count+"    "+fraction);
        }
    }
}