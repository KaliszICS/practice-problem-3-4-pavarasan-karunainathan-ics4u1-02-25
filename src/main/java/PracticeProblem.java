public class PracticeProblem {
	static int[] arr;
	static boolean[] inSeq = new boolean[1000000];
	static int recamanNum(int n){
		if(n == 0){
			return 0;
		}

		int a = recamanNum(n-1);
		if(a-n > 0 && !inSeq[a-n]){
			arr[n-1] = a-n;
			inSeq[a-n] = true;
			return a-n;
		}else{
			arr[n-1] = a+n;
			inSeq[a+n] = true;
			return a+n;
		}
	}
	static int[] recaman(int n){
		if(n < 0){
			return new int[0];
		}
		arr = new int[n];
		inSeq = new boolean[1000000];
		recamanNum(n);
		return arr;
	}

	public static void main(String args[]){}
}
