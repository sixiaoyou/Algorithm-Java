/*
Java一维数组的常见操作
 */

package pers.you.algorithm.commonsense;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先声明后创建
		
		int myArray[];
		myArray = new int[10];
		
		//在声明的同时创建
		int myArray01[] = new int[10];
		
		//直接赋值
		int[] intArray02 = {1,2,3,4,5};
		
		//定义Java数组
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c"};
		String[] cArray = new String[]{"a","b","c"};
		//连接两个数组
		String[] combArray = ArrayUtils.addAll(bArray,cArray);
	
		//将Array转换为Set集合
		Set<String> set = new HashSet<String>(Arrays.asList(cArray));
		
		//数组翻转
		int[] intArray = {1,2,3,4,5};
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));
		
		//从数组中移除一个元素
		int[] removed = ArrayUtils.removeElement(intArray, 3);
		System.out.println(Arrays.toString(removed));
		
		//将一个int值转化为byte数组
		byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
		for(byte t:bytes){
			System.out.format("0x%x", t);
		}
		
	}

}
