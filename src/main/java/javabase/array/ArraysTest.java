package javabase.array;

import java.util.Arrays;

/**
 * @description: Arrays数组工具类测试
 * @fileName: ArraysTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/24 16:50
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ArraysTest {
    public static void main(String [] args){

        int [] arr = new int[]{-123,-1,1,3,5,-67,2,99,-20,140,155};
        int [] arr1 = new int[]{-123,-1,1,3,5,67,78,99,120,140,180};

        //Arrays.equals(int [] a,int [] b)
        boolean equals = Arrays.equals(arr, arr1);
        if(equals){
            System.out.println("arr数组和arr1数组元素相同");
        }else{
            System.out.println("arr数组和arr1数组元素不相同");
        }
        //Arrays.sort(int [] a)
        Arrays.sort(arr);
        //Arrays.toString(int [] a)
        System.out.println(Arrays.toString(arr));
        //Arrays.fill(int [] a,int val)
        Arrays.fill(arr1,999);//全替换成999
        System.out.println(Arrays.toString(arr1));
        //Arrays.binarySearch(int [] a,int b) 找不到返回角标为负数
        System.out.println(Arrays.binarySearch(arr, 1));
    }
}
