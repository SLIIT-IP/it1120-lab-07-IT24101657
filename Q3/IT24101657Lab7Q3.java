import java.util.Scanner;
public class  IT24101657Lab7Q3
{
	public static void main (String[]arg)
	{
	Scanner input =new Scanner(System.in);
	double discount=5.0;
	int count=1;
	double discountis;
	double amounttobepaid;
	while(count<=5)
	{
		System.out.println("Customer "+count);

		System.out.print("Enter total bill amount :");
		int amount=input.nextInt();
	
		System.out.print("Enter the method of payment(C for cash, O for other) :");
		char method=input.next().charAt(0);
	
		discountis=amount*5.0/100.0;
		if(method== 'C'||method== 'c'){System.out.println("Discount is :"+discountis);
		amounttobepaid=amount-discountis;
		System.out.println("Amount to be paid :"+amounttobepaid);
		}
		
		else if(method== 'O'||method== 'o'){System.out.println("No Discount applicable");
		discountis=0.0;
		amounttobepaid=amount-discountis;
		System.out.println("Amount to be paid :"+amounttobepaid);
		}
		
		else{System.out.println("Payment Mode is Not Valid");
		}

		count++;
		System.out.println();
		
	}
	}


}