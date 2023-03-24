package javabase.array;

import java.util.Arrays;

/**
 * @description: 数组的反转
 * @fileName: ArrayRever.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 22:07
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ArrayRever {
    public static void main(String [] args){

       String [] str = new String[]{"JJ","DD","MM","BB","GG","AA","QQ"};

       //将数组反转输出
       String temp;
       //方式一 :
       for(int i = 0 ; i < str.length/2 ; i++){
           temp = str[i];
           str[i] = str[str.length-1-i];
           str[str.length-1-i] = temp;
       }
       //方式二 :
       for(int i = 0 , j = str.length-1 ; i < j ; i++,j--){
           temp = str[i];
           str[i] = str[j];
           str[j] = temp;
       }

       //输出反转后的数组
        for(int i = 0 ;i < str.length ; i++){
            System.out.println(str[i]);
        }

    }
}
