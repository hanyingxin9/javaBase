package javabase.oop.bank;

/**
 * @description: 银行账户
 * @fileName: Account.java
 * @author: hanyingxin
 * @createAt: 2023/4/14 0:06
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Account {

    private double balance;

    public Account(){

    }

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    /*
       存钱
     */
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("存钱金额不能为负");
            return;
        }
        balance += amount;
        System.out.println("存钱成功" + amount);
    }

    /*
      取钱
     */
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足");
            return;
        }
        balance -= amount;
        System.out.println("取钱成功" + amount);
    }

}
