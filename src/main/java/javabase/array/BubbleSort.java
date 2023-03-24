package javabase.array;

/**
 * @description: 冒泡排序
 * @fileName: BubbleSort.java
 * @author: hanyingxin
 * @createAt: 2023/3/24 12:22
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class BubbleSort {
    public static void main(String [] args){

        int [] arr = new int[]{1,34,56,23,56,-12,-23,-99,34,56};
        //定义交换临时变量temp
        int temp;

        //输出排序前数组
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //冒泡排序
        //外层循环控制轮数
        //内层循环控制相邻的两个元素比较，内层循环一轮将最大的元素冒到最后
         for(int  i = 0 ; i < arr.length - 1 ; i++){
             for(int j = 0 ; j < arr.length - 1 - i ; j++){
                    if(arr[j] > arr[j + 1]){
                         temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                    }
             }
         }

         //输出排序后数组
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
