package javabase.array;

/**
 * @description: 杨辉三角
 * @fileName: YangHuiSanJiao.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 17:34
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class YangHuiSanJiao {
    public static void main(String [] args){

        //使用二维数组打印 10行的杨辉三角
        //一共10行，每行元素个数不确定
        int [][] arr = new int[10][];
        //为二维数组每行设置元素个数
        for(int  i = 0 ; i < arr.length ; i++){
            arr[i] = new int[i + 1];
            //每行第一个位置和最后一个位置置为 1
            arr[i][0] = 1;
            arr[i][arr[i].length-1] = 1;
            //核心 : 为内部赋值
            for(int j = 1 ; j < arr[i].length-1 ; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        //遍历二维数组，显示杨辉三角
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
