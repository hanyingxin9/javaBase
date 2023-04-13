package javabase.oop.account;

/**
 * @description: 银行顾客测试类
 * @fileName: CustomerTest.java
 * @author: hanyingxin
 * @createAt: 2023/4/13 23:49
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class CustomerTest {
    public static void main(String [] args){

         Customer customer = new Customer("Jane","Smith");
         Account account = new Account(1000,2000,0.0123);
         customer.setAccount(account);
         customer.getAccount().deposit(100);
         customer.getAccount().withdraw(960);
         customer.getAccount().withdraw(2000);

         System.out.println("[Customer : " + customer.getFirstName() + "," + customer.getLastName() +
         "] has a count : id\tis\t" + customer.getAccount().getId() + "\tbalance\tis\t" + customer.getAccount().getBalance()
         + "\tannualInterestRate\tis\t" + customer.getAccount().getAnnualInterestRate() * 100 + "%");
    }
}
