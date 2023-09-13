package HW.L6;

public class ATM {
    int amountOf20;
    int amountOf50;
    int amountOf100;

    public ATM (int amountOf20, int amountOf50, int amountOf100){
        this.amountOf20=amountOf20;
        this.amountOf50=amountOf50;
        this.amountOf100=amountOf100;
    }

    public ATM(){

    }

    void addToATM (int add20, int add50, int add100){
        this.amountOf20=+add20;
        this.amountOf50=+add50;
        this.amountOf100=+add100;
    }

    boolean removingLiquids(int amount){
        int sum=this.amountOf20+this.amountOf50+this.amountOf100;
        boolean b=false;
        int amOf20=0, amOf50=0, amOf100=0;
        int a=amount;
        for (int i=0; i<=sum; i++){
            if (this.amountOf100!=0&amount>0){
                amount-=100;
                this.amountOf100-=1;
                amOf100++;
            } else if (this.amountOf50!=0&amount>0) {
                amount-=50;
                this.amountOf50-=1;
                amOf50++;
            } else if (this.amountOf20!=0&amount>0) {
                amount-=20;
                this.amountOf20-=1;
                amOf20++;
            } else if (amount==0) {
                System.out.println("Вы сняли "+a+" у.е. Из них:");
                System.out.println(amOf100+" купюр номиналом 100");
                System.out.println(amOf50+" купюр номиналом 50");
                System.out.println(amOf20+" купюр номиналом 20");
                b=true;
                break;
            } else break;
        }
        return b;
    }


}
