import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {
    /*
    Assignment: Write an application that reads the radius of a sphere (in inches) and prints its volume and surface
    area. Use the DecimalFormat class to print the output to four decimal places. r represents the radius.
    Volume = (4/3)(pi)(r)^3
    Surface Area = 4(pi)(r)^2
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Double sphereRadius = input.nextDouble();

        Double sphereVolume = (4.0/3.0) * Math.PI * (sphereRadius * sphereRadius * sphereRadius);
        Double sphereSurfaceArea = 4 * Math.PI * (sphereRadius * sphereRadius);

        // Convert sphereVolume to toDecimalVolume to finalVolume
        // https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html
        DecimalFormat toDecimalVolume = new DecimalFormat("###.####");
        String finalVolume = toDecimalVolume.format(sphereVolume);

        // Convert sphereSurfaceArea to toDecimalSurfaceArea to finalSurfaceArea
        DecimalFormat toDecimalSurfaceArea = new DecimalFormat("###.####");
        String finalSurfaceArea = toDecimalSurfaceArea.format(sphereSurfaceArea);

        System.out.println("Volume is " + finalVolume + " cubic inches.");
        System.out.println("Surface Area is " + finalSurfaceArea + " square inches.");
    }
}
