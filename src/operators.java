/*
Operator 	Description
  ==			equal to
  != 			not equal to
  < 			less than
  <= 			less than or equal to
  > 			greater than
  >= 			greater than or equal to*/
//Operators are mostly used in loops like (for,while) etc and in conditions just 
// like... (if and else)
public class operators {

	public static void main(String[] args) 
	{
		boolean equals = (6==5); //returns false as 6 is not equal to 5
		boolean notEqual = (6!=5);//returns ture as 6 is not equal to 5
		boolean lessThan = (6<5); // returns false as 6 is greater than 5
		boolean greaterThan = (6>5);// returns true as 6 is greater than 5
		boolean lessThanOrEqual = (6<=9); // returns true
		boolean greaterThanOrEqual = (6>=6); // returns true
		System.out.println("For equals : "+equals+"\nFor not Equals :"+notEqual+
				"\nFor less Than : "+lessThan+"\nFor Greater Than : "+greaterThan+
				"\nFor Less Than or Equal to : "+lessThanOrEqual+"\nFor Greater Than or Equal "
				+greaterThanOrEqual);
		// use if else 
		if(6>5)
		{
			System.out.println("6 is greater than 5");
		}
		else if(6<5)
		{
			System.out.println("6 is less than 5  ");
			}
		else
		{
			System.out.println(" Code ended ");
		}
		//using for loop
		System.out.println("Using for loop");
		for(int i=1;i<=5;i++)
		{
			int j=0;
			System.out.println((j+=i)+" : My name?");// prints "My name" 5 times
		}
		
		
		
		}
	}

