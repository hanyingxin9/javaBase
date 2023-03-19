package javabase.array;

/**
 * @description: 创建长度为 6的数组，元素为[1,30]的随机数 , 要求数组元素不能重复
 * @fileName: RandomArray.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 19:31
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class RandomArray {
    public static void main(String [] args){


        //动态创建数组
        int [] arr = new int[6];
        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = (int)(Math.random() * 30 + 1);
            if(i > 0){
                for(int j = 0 ; j <= i-1 ; j++){
                    if(arr[i] == arr[j]){
                      //arr[i] = (int)(Math.random() * 30 + 1);
                      //重复返回 i的位置再赋一遍随机数，重新判断
                      i--;
                    }
                }
            }
        }
        //遍历输出数组元素
        for (int ar: arr) {
            System.out.println(ar);
        }
    }
}
