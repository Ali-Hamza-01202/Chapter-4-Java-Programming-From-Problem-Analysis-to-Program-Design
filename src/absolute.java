import java.util.Scanner;
public class absolute 
{

	public static void main(String[] args) 
	{
		System.out.println("you can use any commented feature whatever you want by uncomment it:");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		if(number<0)
		{
			number=-number;
			System.out.println("Absolute value is : "+number);
		}
		else
		{
			number=number;
			System.out.println("The number "+number+" is already in absolute form");	
		}
		
		// you can use already build-in function to do the same job
		/*System.out.println("Method 2");
		int result = (int)(Math.abs(number));
		System.out.println("Absolute number is : "+result);
		System.out.println("By calling method 3");
		absolute main = new absolute();
		main.absoluteValue(number);
	}
	*/
// you can create your own operation for it
	/*public void absoluteValue(int number)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		if(num<0)
		{
			num=-num;
			System.out.println("Absolute value is : "+num);
		}
		else
		{
			num=num;
			System.out.println("The number "+num+" is already in absolute form");	
		}
*/
	}
	
	
}
