package com.exercise102functions.app;
import java.util.Scanner;
public class Factorial 
{

	public static void main(String[] args) 
	{
		// Variable declaration
		long factorial=1;
		int number=-1;
		
		Scanner input=new Scanner(System.in);
		
		do
		{
			System.out.println("Input number to calculate factorial: ");
			number=input.nextInt();
			if(number<=0)
			{
				System.out.println("You must input aa positive value");
			}
		}while(number<=0);

		factorial=GiveFactorial(number);
		System.out.println("The factorial of "+ number+" is:\t "+factorial+" \n wich is gotten by miltiplying several times "+number);
	}
	
	public static long GiveFactorial(int n)
	{
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

}
