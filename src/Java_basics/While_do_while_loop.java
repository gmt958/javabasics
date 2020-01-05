package Java_basics;

public class While_do_while_loop {
	
	public static void main(String[] args)
	{
		
	 int a=40;
	 int a1=50;

	 while (a>10)
	 {
		 a-=5;
			 
		 if(a==30) {
			 continue;
		 }
		 System.out.println("While loop" +a);
		 
	 }

	 
	 do {
		 
		 a1-=5;
		 System.out.println("do while loop :"+a1);
	 }
	 while(a1>20);
	
	 }

}


