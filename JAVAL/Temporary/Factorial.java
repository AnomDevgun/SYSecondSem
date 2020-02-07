import java.util.*;
class Fact
{
	public Fact()
	{
			
			System.out.println("\n_____________________________________FACTORIAL______________________________________\n");
	}	
	public int factorialOf(int num) 
	{
		if(num==0)
		{
			return 1;	
		}		
		else
		{
			return (num*factorialOf(num-1));		
		}	
	}
}
class Factorial
{
	public static void main(String args[])
	{
		Fact f= new Fact();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the number: \t");
		int num=sc.nextInt();
		System.out.println("\n Factorial is: \t: "+f.factorialOf(num));
	
	}
}
