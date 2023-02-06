package Practice;


public class practice1 
{
	int year;
	
	void firstProgram()
	{
		System.out.println("This is my First Program");
	}
	
	void LeapYear(int para1)
	{
		if(para1%4 == 0)
		System.out.println(para1+" is Leap Year");
		else
			System.out.println(para1+" is not Leap Year");
	}
	
	//while loop
	void printNumbers()
	{
			System.out.println("While loop");
			int i = 1;
			while(i <= 100)
			{
				System.out.println(i);
				i++;
			}
	}
	
	//do-while loop
	void printNumdowhile()
	{
		System.out.println("do-while loop");
		
		int u =1;
		
		do
		{
			System.out.println(u);
			u++;
		}while(u<=100);
	}
	//For loop	
	void printNumFor()
	{
			System.out.println("For loop");
			for(int i=1; i<=100; i++)
			{
				System.out.println(i);
			}
	}
	
	//Fibonacci Series Method
	
	void doFibonacci(int n)
	{ 
		int num1 = 0, num2 =1;
		int i =0;
		System.out.println("Fibonacci series");
		
		while(i < n)
		{
			System.out.println(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			i++;
			
		}
	}
	
	void doReverseArray(char[] input1)
	{
		char temp[] = {'1','1','1','1','1'};
		char letter;
		int b=0;
		
		for(int i=input1.length-1; i>=0; i--)
		{
			letter = input1[i];
			temp[b] = letter;
			b++;
		}
		
		for(int j=0; j<input1.length; j++)
		{
		
			input1[j] = temp[j];
			
			System.out.println(input1[j]+"  " );
		}
	}
	
	/*void printarray(char[] input)
	{
		
		for(int i=0; i<input.length; i++)
		{
			System.out.println(input[i]);
		}
	}*/
	
	int doFactorial(int p)
	{
		int f = 1;
		for(int i=1; i<=p; i++)
		{
			 f = f*i;
			
		}
		
		return f;
	}
	public static void main(String[] args) 
	{
		practice1 FP1 = new practice1();
		FP1.firstProgram();
		FP1.LeapYear(1865);
		FP1.LeapYear(2024);
		FP1.printNumbers();
		FP1.printNumdowhile();
		FP1.printNumFor();
		FP1.doFibonacci(12);
		char[] chararray = {'a','e','i','o','u'};
		
		FP1.doReverseArray(chararray);
		
		int factorial = FP1.doFactorial(5);
		System.out.println("Factorial value is : "+factorial);
		

	}

}
