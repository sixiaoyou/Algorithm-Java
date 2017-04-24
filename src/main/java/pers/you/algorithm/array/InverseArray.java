package pers.you.algorithm.array;

import org.junit.Test;

public class InverseArray<T>{
    public void swap(T[] array,int a,int b){
        T t=array[a];
        array[a]=array[b];
        array[b]=t;
    }
    
    public void printArray(T[] array){
        for(T i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public void inverse01(T[] array){
        if(array==null||array.length<=1){
            return;
        }
        for(int i=0,j=array.length-1;i<j;i++,j--){
            swap(array, i, j);;
        }
    }
    public void inverse02(T[] array){
        int n=array.length;
        int half=n/2;
        if(array==null||n<=1){
            return;
        }
        for(int i=0;i<half;i++){
            swap(array, i, n-1-i);;
        }
    }
}
