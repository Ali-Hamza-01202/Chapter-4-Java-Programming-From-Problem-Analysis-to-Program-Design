import java.util.Scanner;
public class representMonth {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int month;
	
		do
		{
			System.out.print("Enter the number of month : ");
			month = scanner.nextInt();
			// we can also use switch statement to do the same job
			switch(month)
			{
			case 1:
			{
				System.out.println("The month is January:");
			}
			break;
			case 2:
				System.out.println("The month is February:");
			break;
			case 3:
				System.out.println("The month is March:");	
				break;
			case 4:
				System.out.println("The month is April:");
			break;
			case 5:
				System.out.println("The month is May:");
			break;
			case 6:
				System.out.println("The month is June:");
			break;
			case 7:
				System.out.println("The month is July:");
			break;
			case 8:
				System.out.println("The month is August:");
			break;
			case 9:
				System.out.println("The month is September:");
			break;
			case 10:
				System.out.println("The month is October:");
			break;
			case 11:
				System.out.println("The month is November:");
			break;
			case 12:
				System.out.println("The month is December:");
			break;
			default:
				System.out.println("Invalid number:");
			}	
			
		}
		
		while(month!=13);	
		// replace switch statement with if statement to do the same job
		/*if(month==1)
		{
			System.out.print("The month is January:");
		}
		if(month==2)
		{
			System.out.print("The month is February:");
		}
		if(month==3)
		{
			System.out.print("The month is March:");
		}
		if(month==4)
		{
			System.out.print("The month is April:");
		}
		if(month==5)
		{
			System.out.print("The month is May:");
		}
		if(month==6)
		{
			System.out.print("The month is June:");
		}
		if(month==7)
		{
			System.out.print("The month is July:");
		}
		if(month==8)
		{
			System.out.print("The month is August:");
		}
		if(month==9)
		{
			System.out.print("The month is September:");
		}
		if(month==10)
		{
			System.out.print("The month is October:");
		}
		if(month==11)
		{
			System.out.print("The month is November:");
		}
		if(month==12)
		{
			System.out.print("The month is December:");
		}
		*/
		
	}

}
