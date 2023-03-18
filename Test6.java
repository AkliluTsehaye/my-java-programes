
public class Test6 {
	static int[] A= {4,9,3,1,6,2,7,1};

	static int i = 0;
	static int j=A.length-1;
	static int leftSum=A[i];
	static int rightSum=A[j];
	static int k;
	static int ipx = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Result(A);
	}
	
	static void Result(int[] A) {
		
		
		for(k=1; k<A.length-2; k++) {
			if(leftSum<rightSum) {
				i++;
				leftSum=leftSum+A[i];
				ipx=1+i;
			}
			else {
				j--;
				rightSum=rightSum+A[j];
				ipx=j-1;
			}
			
		}
		if(leftSum==rightSum) 
			System.out.println(ipx);
		
		else 
			System.out.println("-1");
		
	}

}
