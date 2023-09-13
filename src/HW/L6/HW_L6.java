package HW.L6;

public class HW_L6 {
    public static void main(String[] args) {

        //task1();
        task2();

    }

    static void task1(){
        System.out.println("Task1:");
        CreditCard card1=new CreditCard("BY1111", 10);
        CreditCard card2=new CreditCard("BY2222", 0);
        CreditCard card3=new CreditCard("BY3333", 20);
        card1.refill(10);
        card2.refill(20);
        card3.withdraw(20);
        card1.myBalance();
        card2.myBalance();
        card3.myBalance();
    }

    static void task2(){
        System.out.println("Task*:");


    }

}
