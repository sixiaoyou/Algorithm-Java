/*
 * 线性表之顺序表
 */

package pers.you.algorithm.list;

//List接口
public interface IList {
    // 返回线性表的大小，即数据元素的个数
    public int getSize();

    // 判断线性表是否为空表，如果为空表返回true,否则返回false
    public boolean isEmpty();

    // 判断线性表中是否存在数据元素e
    public boolean contains(Object e);

    public int indexOf(Object e) throws java.lang.ArrayIndexOutOfBoundsException;

    boolean insertBefore(Object obj, Object e);

    void insert(int i, Object e) throws OutOfBoundaryException;

    Object remove(int i) throws OutOfBoundaryException;

}
