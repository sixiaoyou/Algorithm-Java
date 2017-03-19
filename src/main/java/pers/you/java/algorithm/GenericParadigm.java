package pers.you.java.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GenericParadigm {
	
	
	public void notGenericParadigm(){
		List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
//        没有采用泛型，此处Integer值存在隐患
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
//        	Integer 无法转换为 String,报： java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            String name = (String) list.get(i); // 1
            System.out.println("name:" + name);
        }
	}
	
	public void stringGenericParadigm(){
		List<String> list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
//        无法通过编译
//        list.add(100);

        for (int i = 0; i < list.size(); i++) {
//        	Integer 无法转换为 String,报： java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            String name = (String) list.get(i); // 1
            System.out.println("name:" + name);
        }
	}
	
	static class Box<T>{
		private T data;
		public Box(){
			
		}
		
		public Box(T data){
			this.data=data;
		}
		
		public T getData(){
			return data;
		}
	}

	public static void main(String[] args) {
		 	Box<String> name = new Box<String>("corn");
	        Box<Integer> age = new Box<Integer>(712);

	        System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
	        System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
	        System.out.println(name.getClass() == age.getClass());
	}
}
