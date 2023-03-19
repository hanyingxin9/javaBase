package javabase.array;

import java.util.Scanner;

/**
 * @description: 回形数
 * @fileName: AnamorphosisNumber.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 19:39
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class AnamorphosisNumber {
    public static void main(String [] args){

                System.out.print("请输入一个整数：");
                int lenth;
                Scanner scanner = new Scanner(System.in);
                lenth = scanner.nextInt();
                int[][] array = new int[lenth][lenth];
                //判断方向，1从左往右，2从上往下，3从右往左，4从下往上。
                int direction = 1;
                int i = 0;
                int j = 0;
                int k;
                for(k = 1;k <= lenth * lenth;k++) {
                    if(direction == 1) {
                        if(j < lenth && array[i][j] == 0) {//不能先判断数组中元素是否为零，可能会越界
                            array[i][j++] = k;
                        }
                        else {
                            direction = 2;//更换方向为从上到下
                            k--;//这个数没有赋给数组，过了这轮循环又会加一，所以先减一
                            i++;//这一行已经填满数，往下挪一行
                            j--;//下标已经越界，往回挪一列
                        }
                    }
                    else if(direction == 2) {
                        if(i < lenth && array[i][j] == 0) {//不能先判断数组中元素是否为零，可能会越界
                            array[i++][j] = k;
                        }
                        else {
                            direction = 3;//更换方向为从右到左
                            k--;//这个数没有赋给数组，过了这轮循环又会加一，所以先减一
                            j--;//这一列已经填满数，往左挪一列
                            i--;//下标已经越界，往上挪一行
                        }
                    }
                    else if(direction == 3) {
                        if(j >= 0 && array[i][j] == 0) {//不能先判断数组中元素是否为零，可能会越界
                            array[i][j--] = k;
                        }
                        else {
                            direction = 4;//更换方向为从下到上
                            k--;//这个数没有赋给数组，过了这轮循环又会加一，所以先减一
                            i--;//这一行已经填满数，往上挪一行
                            j++;//下标已经越界，往回挪一列
                        }
                    }
                    else if(direction == 4) {
                        if(i >= 0 && array[i][j] == 0) {//不能先判断数组中元素是否为零，可能会越界
                            array[i--][j] = k;
                        }
                        else {
                            direction = 1;//更换方向为从左到右
                            k--;//这个数没有赋给数组，过了这轮循环又会加一，所以先减一
                            j++;//这一列已经填满数，往右挪一列
                            i++;//下标已经越界，往下挪一行
                        }
                    }
                }
                //遍历输出
                for(int[] x : array) {
                    for(int y : x) {
                        System.out.print(y + "\t\t");
                    }
                    System.out.println();
                }

    }
}

