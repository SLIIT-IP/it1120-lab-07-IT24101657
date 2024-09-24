import java.util.Scanner;

public class IT24101657Lab7Q1A
{
	public static void main (String[]args)
	{
	
		Scanner input = new Scanner (System.in);
		int mark1,mark2,mark3,mark4;

		double average;
		
		System.out.print("Enter mark for four subjects: ");
		
		System.out.print("Enter subject mark 1 :");
		mark1 = input.nextInt();
		System.out.print("Enter subject mark 2 :");
		mark2 = input.nextInt();
		System.out.print("Enter subject mark 3 :");
		mark3 = input.nextInt();
		System.out.print("Enter subject mark 4 :");
		mark4 = input.nextInt();

		average = (mark1+mark2+mark3+mark4)/4.0;

		System.out.println("Average is: "+ average);

		
 		if(average>=75 && average<=100)
			{
			System.out.println("Grade: Distinction");
			}

			else if(average>=50&& average<=74){
				System.out.println("Grade: Credit");
			}
				else if(average>=0 && average<=49){
					System.out.println("Grade: Fail");
			}
					else{
						System.out.println("Invalid Marks");}

	}
}
