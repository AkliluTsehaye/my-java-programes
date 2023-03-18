
public class Test2 {

	static int []C= {1,3,5,6,8};
	static int X=0;
	static int Y=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Result(C));
	}
	
	static int Result(int[]A) {
	
		for(int i=0; i<A.length; i++) {
			if(A[i]%2==0) {
				X=X+A[i];
			}
			else
				Y=Y+A[i];
		}
		return X-Y;
		
	}

	
}
