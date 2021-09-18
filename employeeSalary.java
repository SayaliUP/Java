/*6: WAP Enter name, id , city, and basic salary of the program andcalculate the gross salary on following data.
Ta=basic of 35 %
Da=basic of 45 %
HRA=basic of 45 %
Gross Salary: basic+ta+da+hra
================== Employee _Salary=====================
========================================================
Name=Xyz
ID =A123
City=Pune
Basic Salary9077
Ta  =644687
Da=8973
HRA=4445
Gross Salary=67543277
======================================================
*/


import java.util.*;
class employeeSalary
{
	public static void main(String args[])
	{
	
		Scanner s = new Scanner(System.in);
		
		double salary, ta, da, hra, grossSalary,  basicSalary;
		String city,id,name;
		
		System.out.println("================== Employee _Salary=====================\n========================================================");
		System.out.println("Name=");
		name = s.nextLine();
		
		System.out.println("ID=");
		id = s.nextLine();
		
		System.out.println("City=");
		city = s.nextLine();
		
		System.out.println("Basic Salary=");
		basicSalary = s.nextDouble();
		
		ta = 0.35*basicSalary  ;
		da = 0.45*basicSalary;
		hra =0.45*basicSalary ;
		grossSalary = basicSalary+ta+da+hra ;
		
		System.out.println("Name="+name);
		
		System.out.println("ID="+id);
		
		System.out.println("City="+city);
		
		System.out.println("Basic Salary="+basicSalary);
		
		System.out.println("Ta="+ta);
		
		System.out.println("Da="+da);
		
		System.out.println("HRA="+hra);
		
		System.out.println("Gross Salary="+grossSalary);
		}
	}
		