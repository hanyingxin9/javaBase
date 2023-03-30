package javabase.oop;

/**
 * @description: 递归方法 recursion
 * @fileName: RecursionTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/26 17:22
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class RecursionTest {
    public static void main(String [] args){

        Recursion recursion = new Recursion();
        //输出直到 n的总和
        System.out.println(recursion.getSum(100));
        //输出直到 n的乘积
        System.out.println(recursion.getChengJi(3));
        //输出 f(n)
        System.out.println(recursion.getF(10));
        //输出斐波那契指定 n值的数据
        System.out.println(recursion.getFibonacci(10));
        //输出斐波那契数组
        int n = 10;
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = recursion.getFibonacci(i + 1);
        }
        for(int i : arr){
            System.out.print(i + "\t");
        }

    }
}

class Recursion{

    //递归计算 1 - n 的总和
    public int getSum(int n){

        //递归结束条件
        if(n == 1){
            return 1;
        }else{
            //递归
            return n + getSum(n - 1);
        }
    }

    //递归计算 1 - n 的乘积
    public int getChengJi(int n){

        //递归结束条件
        if(n == 1){
            return 1;
        }else{
            //递归
            return n * getChengJi(n - 1);
        }
    }

    //已知有一个数列 : f(0) = 1 , f(1) = 4 , f(n + 2) = 2 * f(n + 1) + f(n)
    //其中 n是大于 0 的整数 ， 求 f(10)的值
    public int getF(int n){

        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            return 2 * getF(n - 1) + getF(n - 2);
        }
    }

    //斐波那契数列（Fibonacci）的第 n个值 ， 并将整个数列打印出来
    // 1 1 2 3 5 8 13 21 34 55
    // 一个数等于前两个数的和
    public int getFibonacci(int n){

        int [] arr = new int[n];

        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }

    }

    //汉诺塔问题

    //快排

    //n阶台阶问题 ， 每次可上一步台阶也可以上两阶 ， 一共有多少种上台阶的方式


}
