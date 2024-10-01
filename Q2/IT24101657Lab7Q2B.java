public class  IT24101657Lab7Q2B
{
	public static void main (String[]arg)
	{
	int count;
	int count2;
	for(count=1;count<=5;count++)
		{
		System.out.print(count --);
		for(count2=1;count2<=count;count2++)
			{
			System.out.print(" * ");
			}
		System.out.println();
		}
	}
}