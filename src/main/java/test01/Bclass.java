package test01;

import java.util.Scanner;

public class Bclass {
    public static void main(String [] args){

       //100以内的质数
       boolean isflag = true;
       for(int i = 2 ; i <= 100 ; i++) {
            for(int j = 2 ; j <= i/2 ; j++){
                if(i % j == 0){
                    isflag = false;
                    break;
                }
            }
            if(isflag == true){
                System.out.println(i);
            }
            //重置isflag
            isflag = true;
       }



    }
}
