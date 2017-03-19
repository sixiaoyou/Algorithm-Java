package pers.you.java.algorithm;

public class Recursion {
	public void  m(int i){
		if (i==1) {
			System.out.println("1*1=1");
		} else {
			m(i-1);
			for(int j =1;j<=i;j++){
				System.out.print(j + "*"+ i + "=" + j * i + " ");
			}
			System.out.println();
		}
			
	}
	
	public Recursion(){
		m(9);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Recursion recursion = new Recursion();
	}

}
