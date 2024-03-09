public class UniformRandom 
{
    public static void main(String[] args)
    {
        double r1 = Math.random();
        double r2 = Math.random();
        double r3 = Math.random();
        double r4 = Math.random();
        double r5 = Math.random();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println("The average is " +  (r1 + r2 + r3 + r4 + r5) / 5.0 );
        System.out.println("Min is " + Math.min(r1, r2, r3, r4, r5));
        System.out.println("Max is " + Math.max(r1, r2, r3, r4, r5));
    }
}