package Java_basics;

public class logical_operators {

	public static void main(String[] args) {
		// Logical AND =&&
		//Logical OR= ||
		//Logical Not= !
		//Bitwise And = &
		//Bitwise OR= |
		//Bitwise Compliment = ~
		
		
		boolean t=true;
		boolean f=false;
		
		System.out.println(t&&f);
		System.out.println(t||f);
		System.out.println(t=!f);
		
		//bitwise will convert into binary format
		
		int num=20; //10100   bitwise ~=01011
		int num1=40;//101000
		//after combining via & it will be //10100 which is 20
	
		System.out.println(num & num1);
		System.out.println(~num); //bit compliment will reverse the binary format  //10100   bitwise ~=01011
		
		

}

	}

//imp -difference btw && and &
