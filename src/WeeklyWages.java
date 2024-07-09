import java.util.Scanner;
public class WeeklyWages {

	public static void main(String[] args) 
	{
		double wages;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hours worked : ");
		double hours = scanner.nextInt();
		System.out.print("Enter the pay rate : ");
		double payRate = scanner.nextInt();
		if(hours>40)
		{
			wages = 40 * payRate + 1.5 * payRate*(hours - 40);
			
		}
		else
		{
			wages = hours * payRate;
		}
		System.out.println("Weekly Wages are : $"+wages);
	}

}
