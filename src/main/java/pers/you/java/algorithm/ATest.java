package pers.you.java.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATest {

	public static void main(String[] args) {
		int[] array={1,2,3,4,5,2,3,3,4,4,4,5};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++){
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
		}
		for(Integer integer : map.keySet()){
			System.out.println(integer + " : " + map.get(integer));
		}
			
	}

}
