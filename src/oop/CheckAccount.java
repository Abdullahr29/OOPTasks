package oop;

import javax.swing.JOptionPane;
public class CheckAccount {
    String accountNum;
    String name;
    double balance;
    public CheckAccount(String a, String n, int b){
        accountNum=a;
        name=n;
        balance=b;
    }
    public void deposit(double d){
        balance=balance+d;}
    void cheque(double c){
        if (balance<1000){
            balance=balance-0.15;
        }
        balance=balance-c;
    }
    double getCurrentBalance(){
        return balance;
    }
    void display(){
        output(accountNum+"\n"+name+"\n"+balance);
    }
    
    static void output(String message)
    { JOptionPane.showMessageDialog(null,message); }  

}
