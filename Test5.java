
public class Test5 {

	static int k=0;
	static int[] first= {1,0,9};
	static int[] second= {2,3,4,78,89,9,6};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result(first, second);
	}
	
	static int[] Result(int[]A,int[]B) {
		if(A==null || B==null) {
			System.out.println("nulll");
			}
		if(A.length==0 ||B.length==0) {
			System.out.println("{}");
			}
		int[] C= new int[k];		
	for(int i=0; i<A.length; i++) {
		 int j = 0;
		for( j=0; j<B.length; j++) {
			if(A[i]==B[j]) {
				//C[k]=A[i];
				k++;
				System.out.println(A[i]);
				
			}
		}
	}
	int[] Myarray = new int[k];
	for(int t=0; t<Myarray.length; t++) {
		
		//Myarray[t]=C[t];
		
	}
	return C;
		
	
	}

}
