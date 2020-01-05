package Java_basics;

public class arithmetic_operators {
	public static void main(String[] args)
	{
		
		// ADD=+
		//SUB=-
		//MUL=*
		//DIV=/
		//MODULUS=%  it will give remainder
		 int num1 =100;
		 int num2=5;
		  num2++;
		  num2+=4;   //num2 will  be 6 here
		 int sum=num1+num2;
		 System.out.println(sum);
		 
		 int div=num1/num2;
		 System.out.println("division:"+div);
		 
		 int div1=num1%num2;
		 System.out.println( "remainder"+div1);
		 
		 
		// increment and decrement
		 
		 int n=1;
		 n++;
		 n+=1;
		 System.out.println("increment ="+n);
		 int m=5;
		 m--;
		 m-=1;
		 System.out.println("decrement ="+m);
	}

}
