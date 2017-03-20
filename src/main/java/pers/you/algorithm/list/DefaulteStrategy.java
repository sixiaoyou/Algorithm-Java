package pers.you.algorithm.list;

public class DefaulteStrategy implements IStrategy{

	@Override
	public boolean equal(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return obj1.equals(obj2);
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return  obj1.toString().compareTo(obj2.toString());
	}
}
