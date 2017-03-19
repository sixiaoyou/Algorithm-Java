package pers.you.java.algorithm;

public class MaximumContinuousSubsequenceSum {
	
	
	public  int maxSum1(int[] array){
		int maxNum = 0;
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				int thisNum = 0;
				for(int k=0;k<j;k++){
					thisNum+=array[k];
				}
				if(thisNum>maxNum){
					maxNum = thisNum;
				}
			}
		}
		return maxNum;
	}
	
	public int maxSum2(int[] array){
		int maxNum = 0;
		int thisNum = 0;
		for(int i=0;i<array.length;i++){
			thisNum+=array[i];
			if(thisNum > maxNum){
				maxNum = thisNum;
			}else if(thisNum < 0){
				thisNum = 0;
			}
		}
		return maxNum;
	}
	
	
	public void maxSumTestCase(){
		int[] array = {1,2,3,-1,4,5,6,7,-2};
		System.out.println(maxSum1(array));
		System.out.println(maxSum2(array));
	}
	

	public MaximumContinuousSubsequenceSum() {
		maxSumTestCase();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MaximumContinuousSubsequenceSum m =new MaximumContinuousSubsequenceSum(); 
	}
}
