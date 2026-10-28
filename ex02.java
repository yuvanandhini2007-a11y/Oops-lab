package distance; 
import java.util.*;
import java.text.DecimalFormat; 
public class DistanceConvertor
{
double meter,km,miles;
Scanner sc = new Scanner(System.in); 
DecimalFormat f = new DecimalFormat("##.###"); 
public void convertMeterToKm()
{
System.out.println("Enter the meter"); 
meter = sc.nextFloat();
km =        meter * 0.001; 
System.out.println("Kilometer : "+f.format(km));
}
public void convertKmToMeter()
{
System.out.println("Enter the Kilometer"); 
km = sc.nextFloat();
meter = km / 0.001;
System.out.println("Meter : "+f.format(meter));
}
public void convertMilesToKm()
{
System.out.println("Enter the miles"); 
miles = sc.nextFloat();
km = miles * 1.6093; 
System.out.println("Kilometer : "+f.format(km));
}
public void convertKmToMiles()
{
System.out.println("Enter the Kilometer"); 
km = sc.nextFloat();
miles = km / 1.6093; 
System.out.println("Miles : "+f.format(miles));
}
}