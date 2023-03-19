package javabase.array;

/**
 * @description: 数组之间的复制
 * @fileName: ArrayCopy.java
 * @author: hanyingxin
 * @createAt: 2023/3/19 21:37
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ArrayCopy {
    public static void main(String [] args){

        /*
          以下将 arr1直接赋值给 arr2 的方式不叫数组的拷贝
          只是 arr2变量指向了 arr1所指向的数组 ，堆空间中只有一份的数组实体
         */
        int [] arr1 = new int[5];
        int [] arr2;
        arr2 = arr1;

        //数组之间的复制
        String [] str1 = new String[]{"hello","world","good","grade"};
        String [] str2;

        //数组的复制是通过循环将每个元素挨个赋值
        str2 = new String[str1.length];
        for(int i = 0 ; i < str1.length ; i++) {
            str2[i] = str1[i];
        }
        for (String str : str2) {
                System.out.println(str);
        }

    }
}
