package pers.you.algorithm.recursion;

import java.awt.Checkbox;

import org.junit.Test;

import junit.framework.Assert;

public class MonkeyEatFruit {

    public int eat01(int n){
        int a=1;
        for(int i=2;i<=10;i++){
            a=2*a+2;
        }
        return a;
    }
    public int eat02(int n){
        System.out.println("f"+n+")压栈");
        if(n==1){
            System.out.println("此时函数栈达到最大深度");
            System.out.println("f"+n+")弹栈");
            return 1;
        }else{
            int a=eat02(n-1)*2+2;
            System.out.println("f"+n+")弹栈");
            return a;
        }
    }
    
    public int eat03(int n){
        return n==1?1:eat03(n-1)*2+2;
    }
    
    
    public void check(int n,int num){
        int a=num;
        for(int i=2;i<=10;i++){
            a=a/2-1;
        }
        System.out.println(a);
        Assert.assertTrue(a==2);
    }
    @Test
    public void test01(){
        System.out.println(eat01(10));
    }
    @Test
    public void test02(){
        System.out.println(eat02(10));
    }
    @Test
    public void test03(){
        System.out.println(eat03(10));
    }
    @Test
    public void testCheck(){
        int n=10;
        int num=1534;
        check(n, num);
    }
}
