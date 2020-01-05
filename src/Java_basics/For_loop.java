package Java_basics;

public class For_loop {

	public static void main(String[] args) {
		//  For loop printing 1 to 50
		
		for(int i=0;i<=20;i++)
		{
			System.out.print(" "+i);
		}
		//fibonacci series for 20
		// 0 1 1 2  3 5 8 13 etc
		
		int num1 =0;
		int num2 =1;
		int num3 =0;
		System.out.println();  
		for (int i=1; i<=20;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
