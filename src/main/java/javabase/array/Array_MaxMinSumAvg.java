package javabase.array;

/**
 * @description: 求数值型数组中元素的最大值 ， 最小值 ， 平均数 ， 总和等
 * @fileName: Array_MaxMinSumAvg.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 20:58
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Array_MaxMinSumAvg {
   public static void main(String [] args){

        //定义一个 int型的一维数组 ，包含10个元素 ，分别赋一些随机整数（两位数）
        //求出所有元素的最大值，最小值，平均数，总和
        int [] arr = new int[10];

        //赋随机数
        for(int  i = 0 ;i < arr.length; i++){
             arr[i] = (int)(Math.random() * 90 + 10);//[10,99]
        }
        //求数组中元素 max min sum avg
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        double avg = 0;

        for(int i = 0 ; i < arr.length ; i++){

             //遍历过程中更新最大值
             if(arr[i] > max){
               max = arr[i];
             }
             //遍历过程中更新最小值
             if(arr[i] < min){
               min = arr[i];
             }
             //累计总和
             sum += arr[i];
             //遍历数组元素
             System.out.print(arr[i] + "\t");
        }
        avg = sum / (arr.length + 0.0);
        System.out.println();
        System.out.println("数组最大值 max " + max);
        System.out.println("数组最小值 min " + min);
        System.out.println("数组总和 sum " + sum);
        System.out.println("数组平均值 avg " + avg);






   }
}
