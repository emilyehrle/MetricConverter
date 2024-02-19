import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        final double METERS_PER_MILE = 1609.344;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCH = 0.0254;
        double meters;

        Scanner in = new Scanner(System.in);

        do
        {
            System.out.print("Enter your measurement in meters: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input!");
                System.out.print("Enter your measurement in meters: ");
                in.next();}
            meters = in.nextDouble();
            if (meters < 0) {
                System.out.println("Measurement cannot be a negative number.");
            }
        } while (meters < 0) ;

        System.out.println(meters + " meters is equal to " + meters/METERS_PER_MILE + " miles.");
        System.out.println(meters + " meters is equal to " + meters/METERS_PER_FEET + " feet.");
        System.out.println(meters + " meters is equal to " + meters/METERS_PER_INCH + " inches.");

        in.close();
    }
}