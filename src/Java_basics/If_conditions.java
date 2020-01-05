package Java_basics;

public class If_conditions {

	public static void main(String[] args) {
		
		//if else condition
		
		int num1=200;
		int num2 =400;
		
		if(num1<num2) {
			System.out.println("Greater:"+num2);
		}
			else {
				System.out.println("Smallest:"+num1);
			}
		
	
	// nested if
	
	int marks=66;
	
	if(marks>90)
	{
		System.out.println("A grade");
	}else if(marks>75) {
		System.out.println("B grade");
	}else if(marks>60){
			System.out.println("C grade");
	}else if(marks>40) {
		System.out.println("Fail");
	}
	}

	}



