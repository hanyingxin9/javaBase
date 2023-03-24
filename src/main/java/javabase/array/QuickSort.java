package javabase.array;

/**
 * @description: 快速排序 QuickSort
 * @fileName: QuickSort.java
 * @author: hanyingxin
 * @createAt: 2023/3/24 12:52
 * @updateBy: hanyingxin
 * @remark: Copyright
 */

public class QuickSort {

    //快排实现方法
    public static void quickRow(int[] array, int low, int high){

        //定义i , j两个指针和基准 pivot
        int i,j,pivot;
        //定义临时变量
        int temp;
        //结束条件
        if (low >= high) {
            return;
        }

        i = low;
        j = high;

        //选择的节点，这里选择的数组的第一个数作为基准
        pivot = array[low];
        //循环开始
        while (i < j){
            //从右往左找比节点小的数，循环结束要么找到了，要么i=j
            while (array[j] >= pivot && i < j){
                j--;
            }
            //从左往右找比节点大的数，循环结束要么找到了，要么i=j
            while (array[i] <= pivot && i < j){
                i++;
            }
            //如果 i != j 说明都找到了，就交换这两个数
            if (i < j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // i == j 一轮循环结束，交换节点的数和相遇点的数
        array[low] = array[i];
        array[i] = pivot;
        //递归调用 : 数组“分两半”,再重复上面的操作
        quickRow(array,low,i - 1);
        quickRow(array,i + 1,high);
    }

    //测试
    public static void main(String[] args) {

        int[] array = {6,3,7,1,9,4,8,5,2,10};
        //输出未排序数组
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //快速排序指定排序位置
        int low = 0;
        int high = array.length - 1;
        //调用快速排序算法
        quickRow(array,low,high);
        //输出快速排序后数组
        for (int i : array) {
            System.out.print(i + "\t");
        }

    }
}

