package pers.you.algorithm.list;

//顺序表类
public class MyArrayList implements IList{
	public static void main(String[] args){
		
	}
	
	private final int LEN = 8;		//数组的默认大小
	private IStrategy strategy;         //数据元素的比较策略
	private int size;	                       //线性表中数据元素的个数
	private  Object[] elements;        //数据元素数组
	

	public MyArrayList() {
	    this(new DefaulteStrategy());
    }
	
	public MyArrayList(IStrategy strategy){
	    this.strategy = strategy;
	    size = 0;
	    elements = new Object[LEN];
	}

    @Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
	    for(int i = 0;i<size;i++){
	            if(this.strategy.equal(e, elements[i])){
	                return true;
	            }
	}
	    return false;
	}
	
	@Override
	public int indexOf(Object e){
	    for(int i = 0;i<size;i++){
	        if(this.strategy.equal(e, elements[i])){
	            return i;
	        }
	    }
	    return -1;
	}
	
	   @Override
	    public void  insert(int i,Object e) throws OutOfBoundaryException {
	       //检查 下标越界
	       if( i < 0 || i>=size){
	               throw new OutOfBoundaryException("指定的插入序号越界");
	       }
	       //检查线性数组的容量
	       if(size >= elements.length){
	           expandSpace();
	       }
	       //将插入位置后的数据元素依次向后移动一个单位
	       for(int j = size;j>i;j--){
	           elements[j] = elements[j -1];
	       }
	       //插入数据
	       elements[i] = e;
	       size++; //元素个数+1
	    }
	
	   //扩展顺序表空间
	   private void expandSpace(){
	       Object[] a = new Object[elements.length*2];
	       for(int i=0;i<elements.length;i++){
	           a[i] = elements[i];
	       }
	       elements = a;
	   }
	   
	
	@Override
	public boolean  insertBefore(Object obj,Object e){
	   //找到插入位置
	    int i = indexOf(obj);
	    if( i<0 ){
	        return false;
	    }
	    insert(i, e);
	    return true;
	}
	
	public boolean  insertAfter(Object obj,Object e){
	    //找到插入位置
	    int i = indexOf(obj);
	    if( i<0 ){
	        return false;
	    }
	    insert(i+1, e);
	    return true;
	}
	
	@Override
	public Object remove(int i) throws OutOfBoundaryException{
	    //首先检查越界
	    if(i<0 || i>=size){
	     throw new OutOfBoundaryException("错误，指定的删除序号越界");
	    }
	    Object obj = elements[i];
	    for(int j=i;j<size-1;j++){
	        elements[j] = elements[j+1];
	    }
	    elements[--size] = null;
	    return obj;
	}
	
}
