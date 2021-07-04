/*3. If the marks obtained by a student in five differentsubjects and name are input through the keyboard, write a program tofind out theaggregate marks and percentage marks obtained by
 the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.
 
 ================ Student Details======================
 Name=
 Phy=
 ChemBio=
 Math=
 Eng=
 Percentange=
 Average=
 */
 
 
 import java.util.*;
 class student
 {
	public static void main(String args[])
	{
	
	Scanner s = new Scanner(System.in);
	String name;
	double physics, chem_bio, math, eng, percentage, average;
	
	System.out.println("\n\n================ Student Details======================");
	System.out.println("\nName		=");
	name = s.nextLine();
	
	System.out.println("\nPhy		=");
	physics = s.nextDouble();
	
	System.out.println("\nChemBio		=");
	chem_bio = s.nextDouble();
	
	System.out.println("\nMath		=");
	math = s.nextDouble();
	
	System.out.println("\nEng		=");
	eng = s.nextDouble();
	
	percentage =((physics+chem_bio+math+eng)/400)*100 ;
	average = (physics+chem_bio+math+eng)/4 ;
	
	System.out.println("Percentange	="+percentage);
	System.out.println("Average    	="+average);
	}
}
	