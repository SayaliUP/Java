/*5. WAP enter length and breadth of triangle and calculate the area of traiangle.*/


import java.util.*;
class triangle
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		double base, height, areaOftriangle;
		
		System.out.println("Enter the base of triangle = ");
		base = s.nextDouble();
		
		System.out.println("Enter the height of triangle = ");
		height = s.nextDouble();
		
		areaOftriangle = 0.5*base*height;
		
		
		System.out.println("Area of triangle = "+areaOftriangle);
	}
}	
