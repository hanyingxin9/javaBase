package javabase.oop.bank;

/**
 * @description: 银行测试类
 * @fileName: BankTest.java
 * @author: hanyingxin
 * @createAt: 2023/4/14 0:38
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class BankTest {
    public static void main(String [] args){

        Bank bank = new Bank(15);
        bank.addCustomer("Jane","Smith");

        Account account = new Account(1000);
        bank.getCustomer(bank.getCustomerOFNumber()).setAccount(account);

        //连接调用
        bank.getCustomer(bank.getCustomerOFNumber()).getAccount().deposit(1000);
        bank.getCustomer(bank.getCustomerOFNumber()).getAccount().withdraw(1900);
        bank.getCustomer(bank.getCustomerOFNumber()).getAccount().withdraw(200);
        System.out.println(bank.getCustomerOFNumber());
        System.out.println(bank.getCustomer(1));

        bank.addCustomer("wanli","yang");
        System.out.println(bank.getCustomerOFNumber());



    }
}
