package HW.L6;

public class CreditCard {

    String AccountNumber;
    int balance;

    public CreditCard(String AccountNumber, int balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }



    public void refill(int add) {
        this.balance=this.balance+add;
    }

    public void withdraw(int blow){
        this.balance = this.balance - blow;
    }

    void myBalance(){
        System.out.println("Your account balance is: "+this.balance);
    }



}
