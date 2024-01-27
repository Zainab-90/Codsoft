// Task 2: Student Grade Calculator

import java.util.Scanner;
	
public class GradeCalculator
{
  	public static void main(String args[])
    	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n************ Student Grade Calculator ************\n\n");

		System.out.print("Enter Your Name: ");
		String name = sc.next(); 

		System.out.print("Enter Your Division: ");
		String Div = sc.next(); 

		System.out.println("Enter Your Marks Out Of 100 In the Following Subjects: \n");

		System.out.print("English: ");
		int eng = sc.nextInt();

 		System.out.print("Maths: ");
		int mat = sc.nextInt();

   		System.out.print("History: ");
		int hist = sc.nextInt();

		System.out.print("Geography: ");
		int geog = sc.nextInt();

		System.out.print("Science: ");
		int sci = sc.nextInt();
	
    		System.out.print("Hindi: ");
		int hin = sc.nextInt();

		System.out.print("Marathi: ");
		int mar = sc.nextInt();

		float totalMarks = eng + mat + hist + geog + sci + hin + mar;

		System.out.println("\nTotal Marks: "  +totalMarks+ "/700"); 

		float avg = totalMarks/7;
		System.out.println("\nYour Average Of 7 Subjects Is: " +avg);
		

		if(totalMarks >= 600 && totalMarks <= 700 )
		{
			System.out.println("\nYou Have Received A Grade!!");
		}
		else if(totalMarks >= 500  && totalMarks < 600 )
		{
			System.out.println("\nYou Have Received B Grade!!");
		}
		else if(totalMarks >= 400 && totalMarks < 500 )
		{
			System.out.println("\nYou Have Received C Grade!!");
		}
		else if(totalMarks >=300  && totalMarks < 400 )
		{
			System.out.println("\nYou Have Received D Grade!!");
		}
		else if(totalMarks >= 20  && totalMarks < 300 )
		{
			System.out.println("\nYou Have Received E Grade!!");
		}
		else if(totalMarks >= 100  && totalMarks < 200 )
		{
			System.out.println("\nYou Have Received F Grade!!");
		}
		else if(totalMarks >= 0  && totalMarks < 100 )
		{
			System.out.println("\nSorry Have Failed!");
		}
		else
		{
			System.out.println("\nInvalid Input");
		}

	}
}
