/* 1 Write a program to input Name amount, rate and time from keyboard calculate Simple Interest
Output:============== Simple Interest ===========
Name = Xyz
Amount =3000
Rate=5%
Time=3 yrs
Interest=
Total amount=
*/



import java.util.*;

class simple_interest
{
	public static void main(String args[])
	{

	Scanner s = new Scanner (System.in);
	
	float rate, Interest, amount, totalamount, time;
    String name;
	
	System.out.println("==============Simple Interest==============");
	System.out.println("Name= ");
	name      	= s.nextLine();  
	
	System.out.println("Amount   	        = ");
	amount    	= s.nextFloat();
	
	System.out.println("Rate(in %)     	      = ");
	rate      	= s.nextFloat();
	
	System.out.println("Time(in years)     	= ");
	time      	= s.nextFloat();
	
	s.close();
	
	Interest 	= (amount*rate*time)/100;
	totalamount   	= amount+Interest;
	
	System.out.println("Name      ="+name);
	System.out.println("Interest    ="+Interest);
	System.out.println("Total Amount      ="+totalamount);
	
	
	}
}

