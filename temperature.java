/*3.Temperature of a city in Fahrenheit degrees is input through thekeyboard. Write a program to convert this temperature  into Centigrade degrees
================= Pune City Temprature===========
[  State :Maharashtra]
Enter Temprature In Degree=
The temperature in Degree is .......
The Temprature iu Centigrade...
*/

import java.util.*;
class temperature
{

	public static void main(String args[])
	{
	
	Scanner s = new Scanner(System.in);
	
	float farenheit, centigrade;
	
	System.out.println("\n\n\t\t\t\t\t\t================= Pune City Temprature===========");
	System.out.println("\t\t\t\t\t\t\t\t[  State :Maharashtra]\n\n");
	
	System.out.println("\t\t\t\t\t\tEnter the temperature in farenheit 	=");
	farenheit = s.nextFloat();
	
	centigrade = (((farenheit-32)*5)/9);
	
	System.out.println("\t\t\t\t\t\tThe Temprature in Centigrade 		="+centigrade);
	}
}
	
	
	