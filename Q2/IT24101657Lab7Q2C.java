public class  IT24101657Lab7Q2C
{
	public static void main (String[]arg)
	{
	int count;
	int count2;
	int num=5;
	for(count=1;count<=5;count++)
		{
		for(count2=5;count2>=count;count2--)
			{
			System.out.print(num);
			}
		num--;
		System.out.println();
		}
	}
}