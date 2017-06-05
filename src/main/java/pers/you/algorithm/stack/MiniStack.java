package pers.you.algorithm.stack;

public class MiniStack<T> {
    private int size;
    private Object[] array = new Object[4];

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void expandCapacity() {
        Object[] newArray = new Object[size * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void push(T t) {
        array[size] = t;
        size++;
        if (size == array.length) {
            expandCapacity();
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) array[size - 1];
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T t = peek();
            array[size - 1] = null;
            size--;
            return t;
        }
    }

}
