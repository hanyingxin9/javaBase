import java.util.Arrays;
import java.util.Scanner;

public class Aclass {
    public static void main(String []args) {

//        Scanner scanner = new Scanner(System.in);
//        int i1 = scanner.nextInt();
//        int i2 = scanner.nextInt();
//        int i3 = scanner.nextInt();
//        int a[] = {i1,i2,i3};
//        Arrays.sort(a);
//        System.out.println(a[0] + "" + a[1] + "" + a[2]);
//
//        //
//        int i4 = scanner.nextInt();
//        int high = i4/10;
//        int deep = i4%10;
//        double random = (int)(Math.random()*90);

        Scanner scanner = new Scanner(System.in);
        //输入两个正整数 m,n  求其最大公约数和最小公倍数
        System.out.println("请输入两个正整数 : ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int min = (m > n) ? n : m;
        int max = (m > n) ? m : n;
        int maxGongYue = 1;
        int minGongBei = 0;
        //求最大公约数
        for(int i = 2 ; i <= min ; i++){
            if(max % i == 0 && min % i == 0){
                maxGongYue = i;
            }
        }
        //求最小公倍数
        for(int i = max,j = 2; i <= max * min && j < min; i *= j){
            if(i % min == 0 && i % max == 0){
                minGongBei = i;
                break;
            }
        }
        System.out.println(m + "和" + n +  "的最大公约数和最小公倍数分别是" + maxGongYue + " " + minGongBei);


    }
}
