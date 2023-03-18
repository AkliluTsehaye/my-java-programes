public class Test4 {
	static int remainder = 0;
	static int reverse = 0;
	static int sign=1;
	
	public static void main(String[] args) {
		
		Reverse(-355);
	}
	
	static void Reverse(int number) {
		if(number==0) {
			System.out.println(number);
		}
		//if(number<0) {
		 //sign=-1;
		 //number=-number;
		//}
	
		while(number!=0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
			}
		
		System.out.println(sign*reverse);
		
	
}
	}
