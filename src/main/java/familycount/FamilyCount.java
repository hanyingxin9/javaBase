package familycount;

/**
 * @description: 家庭账目收支系统
 * @fileName: FamilyCount.java
 * @author: hanyingxin
 * @createAt: 2023/3/14 15:26
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class FamilyCount{
    public static void main(String[] args){
        boolean flag=true;
        String details="收支	账户信息	收支金额	说  明"+"\n";
        int balance = 10000;
        while(flag){
            System.out.println("**********家庭收支记账软件**********");
            System.out.println("          1.收支明细");
            System.out.println("          2.登记收入");
            System.out.println("          3.登记支出");
            System.out.println("          4.退    出\n");
            System.out.println("          请选择（1-4）：");
            char selection=Utility.readMenuSelection();
            switch(selection){
                case '1':
                    //System.out.println("1.收支明细");
                    System.out.println("***********当前收支明细记录***********");
                    System.out.println(details);
                    System.out.println("***************登记完成***************");
                    break;
                case '2':
                    //System.out.println("2.登记收入");
                    System.out.println("本次收入金额：");
                    int money=Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String info=Utility.readString();
                    balance+=money;
                    details+=("收入"+"\t"+balance+"\t"+"	"+money+"\t"+"	"+info+"\n");
                    break;
                case '3':
                    //System.out.println("3.登记支出");
                    System.out.println("本次支出金额：");
                    int putmoney=Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String putinfo=Utility.readString();
                    balance-=putmoney;
                    details+=("支出"+"\t"+balance+"\t"+"	"+putmoney+"\t"+"	"+putinfo+"\n");
                    break;
                case '4':
                    //System.out.println("4.退    出");
                    System.out.println("确认是否退出（Y/N）");
                    char exit=Utility.readConfirmSelection();
                    if(exit=='Y'){
                        flag=false;
                    }
                    break;
            }
        }
    }
}
