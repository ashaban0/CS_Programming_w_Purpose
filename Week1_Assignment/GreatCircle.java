public class GreatCircle
{
    public static void main(String[] args)
    {
        double x10 = Double.parseDouble(args[0]);
        double y10 = Double.parseDouble(args[1]);
        double x20 = Double.parseDouble(args[2]);
        double y20 = Double.parseDouble(args[3]);

        double x1 = Math.toRadians(x10);
        double y1 = Math.toRadians(y10);
        double x2 = Math.toRadians(x20);
        double y2 = Math.toRadians(y20);

        double r = 6371.0; // radius of earth in km

        double a = Math.pow(Math.sin((x2 - x1) / 2.0),2);
        double b = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2.0), 2);
        
        double d = 2 * r * Math.asin(Math.sqrt( a + b));
        System.out.println(d + " kilometers");
    }
}