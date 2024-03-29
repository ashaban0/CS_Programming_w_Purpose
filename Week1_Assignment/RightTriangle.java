public class RightTriangle
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean condition1 = a > 0 && b > 0 && c > 0;
        boolean condition2 = a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b; 
        System.out.println(condition1 && condition2);
    }
}