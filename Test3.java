
public class Test3 {

	static char[] B= {'w','e','t','g','r'};
	//static int start=0;
	//static int length=2;
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Result(B, 0, 1);
	}

	static char[] Result(char[] A, int start, int length) {
		if(start<0 || length<0 || start+length-1>=A.length) {
			return null;
			}
		char[] novo = new char[length];
		
		System.out.print("{");
		for(int i=start,j=0; j<length; i++,j++) {
			novo[i]=A[j];
			System.out.print("'"+novo[i]+"'");
			System.out.print(",");
		}
		System.out.print("}");
		return novo;
		
		
	}



}

