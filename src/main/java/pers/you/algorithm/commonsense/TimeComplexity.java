/*
 Java数据结构与算法描述：时间复杂度
 */


package pers.you.algorithm.commonsense;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//因为是一次循环，且循环的方式是i=i*5，不是单纯的+1，减1，所以时间复杂度为O（logN)
	public static int function01(int n){
		int i=0;
		int count=0;
		while(i<=n){
			i=i*5;
			count++;
		}
		return count;
	}
	
	//时间复杂度O(N2)
	public static int function02(int n){
				int count=0;
				int s=0;
				while(s<n){
					count++;
					s=s+count;
				}
				return count;
		}
}
