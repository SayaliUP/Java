/*2 The distance between two cities (in km.) is inputthrough thekeyboard. Write a program to convert and print thisdistance in meters,feet, inches and centimetersThe distance between
two cities (in km.) is input through the keyboard. Write a program to convertand print thisdistance in meters, feet, inches and centimetres
==========KM Conversion========
Enter The Distance in Km........
Distance In meter.......
Distance in inch....
Distance in CM.....
Distance in feet....
*/

import java.util.*;
class distance
{

	public static void main(String args[])
	{
	
	Scanner s = new Scanner(System.in);
	
	double kilometer, meter, inch, centimeter, feet;
	
	System.out.println("\n\nEnter the Distance in Km.....");
	kilometer = s.nextDouble();
	
	meter 		= kilometer * 1000 ;
	inch  		= kilometer * 39370.07874 ;
	centimeter  = kilometer * 500000;
	feet	    = kilometer * 3280.8;
	
	System.out.println("Distance In meter............"+meter+"\n");
	System.out.println("Distance In inch............."+inch+"\n");
	System.out.println("Distance In centimeter......."+centimeter+"\n");
	System.out.println("Distance In feet............."+feet+"\n");
	}
}
	
	
	