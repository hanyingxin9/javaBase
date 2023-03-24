package javabase.array;

import java.util.Arrays;

/**
 * @description: 数组的查找（线性查找 , 二分查找）
 * @fileName: ArraySeek.java
 * @author: hanyingxin
 * @createAt: 2023/3/21 21:47
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ArraySeek {
    public static void main(String [] args){

        //线性查找
        String [] str = new String[]{"AA","BB","QQ","PP","ZZ"};
        String strRegex = "FF";
        //定义一个boolean类型变量，若变量在循环中被改变说明字符在数组中匹配成功
        boolean flag = true;
        for(int i = 0 ; i < str.length ;i++){
            if(strRegex.equals(str[i])){
                flag = false;
                System.out.println("在str数组中找到了strRegex , 位置下标为 : " + i);
            }
        }
        if(flag){
            System.out.println("没有在数组中找到指定元素");
        }

        //二分法查找 : for循环
        //前提 : 1.线性表必须使用顺序存储结构 2.所要查找的数组必须有序
        int [] arr = new int[]{-99,-12,-3,0,12,23,45,67,99,132,147,159};

        //定义开始位置下标 ， 结束位置下标以及中间位置下标
        int start = 0;
        int end = arr.length-1;
        int middle = (start + end)/2;
        //要查找的元素值
        int arrRegex = 159;
        //设置一个标识找到就置为false
        boolean arrFlag = true;
        //循环控制的是二分法执行几轮的问题，因为使用二分法最多不会超过arr.length/2轮，超过了也就说明找不到元素了
        for(int  i = 0 ; i <= arr.length/2 ; i++){
            if(arrRegex != arr[middle]){
                if(arrRegex < arr[middle]){
                    //保证end每次都是 middle - 1 而不是 middle ,是为了能够找到数组最左端
                    end = middle - 1;
                }else{
                    //保证start每次都是 middle + 1 而不是 middle ,是为了能够一直查找到数组最右端
                    start = middle + 1;
                }
                middle = (start + end)/2;
            }else{
                arrFlag = false;
                System.out.println("在arr数组中找到了arrRegex , 位置下标为 : " + middle);
                break;
            }
        }

        //控制只有arrFlag = true也就是在折半查找过程中没有进入过 else的情况（没有找到相同元素）才输出
        //这里也可以不使用arrFlag控制，直接判断条件 i 是否大于 arr.length 也可以
        if(arrFlag){
            System.out.println("没有在数组中找到指定元素");
        }


        //二分法查找 : while循环
        //前提 : 1.线性表必须使用顺序存储结构 2.所要查找的数组必须有序
        int [] arr1 = new int[]{-99,-12,-3,0,12,23,45,67,99,132,147,159};

        //定义开始位置下标 ， 结束位置下标以及中间位置下标
        int start1 = 0;
        int end1 = arr1.length-1;
        int middle1;
        //要查找的元素值
        int arrRegex1 = 159;
        //设置一个标识找到就置为false
        boolean arrFlag1 = true;

        while(start1 <= end1){

            middle1 = (start1 + end1) / 2;
            if(arrRegex1 == arr1[middle1]){
                System.out.println("找到了指定的元素，位置为 : " + middle1);
                arrFlag1 = false;
                break;
            }else if(arr1[middle1] > arrRegex1){
                end1 = middle1 - 1;
            }else{
                start1 = middle1 + 1;
            }
        }
        if(arrFlag1){
            System.out.println("很遗憾没有找到");
        }









    }
}
