/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 10-28-15             
 * Rational Class Program            *
 *                                   *
 ************************************/

// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Runner
{
	
	private static int num, den;   // numerator and denominator of the rational number
	
	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{
	//declared 3 data attributes
	private int firstNum;
	private int firstDen;
	private int gcf;
	private int reducedNum;
	private int reducedDen;
	//Constructor with num and den
	

	public Rational(int n, int d){
		firstNum = n;
		firstDen = d;
	}
	
	public int getNum(){
		return firstNum;	
	}
	
	public int getDen(){
		return firstDen;	
	}
	
	public double getDecimal(){
		return (double)firstNum/ firstDen;
		 	
	}
	
	public String getOriginal(){
		String num1 = String.valueOf(firstNum);
		String den1 = String.valueOf(firstDen);
		return num1+ "/" + den1;
		
	}
	
	public String getReduced(){
		getGCF(firstNum, firstDen);
		reducedNum = firstNum/ gcf;
		reducedDen = firstDen / gcf;
		return reducedNum + "/"+  reducedDen;
	}
	
	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();

	}

	
	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}



