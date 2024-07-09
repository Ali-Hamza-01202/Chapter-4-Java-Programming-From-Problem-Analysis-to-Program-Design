import java.util.Scanner;
public class tax {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String status1,status2;
		double standardException=0.0;
		System.out.print("Enter the tax filling status: married/single :");
		status1 = scanner.next();
		System.out.print("Enter filly : joint/seperately : ");
		status2 = scanner.next();
		if(status1.compareTo("HeadHouseHold")==0)
		{
			standardException = 10000.0; 
		}
		else if(status1.compareTo("Single")==0)
		{
			standardException=9000.0;
		}
		else
		{
			System.out.println("Invalid status1:");
		}
		if(status2.compareTo("joint")==0)
		{
			standardException=12000.0;
		}
		else if(status2.compareTo("seperately")==0)
		{
			standardException=6000.0;
		}
		else
		{
		System.out.println("Invalid status2:");
		}
		System.out.println("Filling Status : "+status1+" "+status2);
		System.out.println("Standard Exception is : $"+standardException);

	}

}
