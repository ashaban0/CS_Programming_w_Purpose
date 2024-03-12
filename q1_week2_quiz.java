public class q1_week2_quiz
{
    public static void main(String[] args)
    { 
        int n = 123456789;
        int m = 0;
        while (n != 0)
        {
        m = (10 * m) + (n % 10);
        n = n / 10;
        }
        System.out.println(m);
        //for (int i = 0, j = 0; i < 10; i++, j+= i)
        //{j += i;}
        //System.out.println(j);
        //int a = 3;
        //int b = 2;
        //int c = 4;
        //if (a > b) { c = 0; }
        //if (a > b) ( c = 0; )
        //if (a > b) c = 0;
        //if a > b, then c = 0;
        //if (a > b) then c = 0;
        //if (a > b) c = 0 else b = 0;
        //if a > b { c = 0; }
        //if (a < b)
        //if (a > b) c = 0 else b = 0;
        //if a > b { c = 0; }
        //if (a > b) then c = 0;
        //if (a > b) c = 10 / 0;
        //str d = "hello" - "world";
        //{
            //if (b < c)
            //if a > b, then c = 0;
            //if (a > b) { c = 0; }
            //if (a > b) ( c = 0; )
            //{
            //    if (c < a) System.out.println(a + " " + b + " " + c);
            //    else System.out.println(c + " " + b + " " + a);
            //}
            //else System.out.println(a + " " + c + " " + b);
        //}
        //else System.out.println(b + " " + a + " " + c);
    }
}