
public class Test1 {

	static int B[]= {};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Result(B));
}

static int Result(int[]A) {
	if(A == null || A.length % 2 == 0)
	return 0;
	
	int midIndex = A.length / 2;
	int midItem = A[midIndex];
	
	for(int i=0; i<A.length; i++) {
		if(A[i]<midItem && i!=midIndex)
			return 0;
	}

	return 1; 
	
}



jhkhjkhkjhkjk

}
