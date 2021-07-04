/*4. The length and breadth of a rectangle and radius of a circle are input through the keyboard. Write a program to calculate the area and perimeter of the rectangle, and the area and circumference of the circle.
Input Data For Rectangle:
Input Radius of Circle:
=================Area=============
Area of Circle=
Circumference of circle=
Area of Rectangle:
Perimeter of Rectangle:  
*/

import java.util.*;
class rectcircle
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		double length, breadth, radius, perimeter, circunference, areaOfrect, areaOfcircle;
		
		System.out.println("\n\n=================Area,Circunference,Perimeter=============");
		
		System.out.println("\n\nInput Data For Rectangle:");
		length = s.nextDouble();
		breadth = s.nextDouble();

		
		System.out.println("\n\nInput Radius of Circle:");
		radius = s.nextDouble();
		
		 areaOfrect     =	length*breadth ;
		 areaOfcircle   =	3.14*(radius*radius) ;
		 circunference  = 	2*3.14*radius ;
		 perimeter      = 	2*(length+breadth);
		 
		 System.out.println("\nArea of Circle				="+areaOfcircle);
		 System.out.println("\nCircumference of circle			="+circunference);
		 System.out.println("\nArea of Rectangle			="+areaOfrect);
		 System.out.println("\nPerimeter of Rectangle			="+perimeter);
		
		}
		
	}
		