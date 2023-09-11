package HW.L6;

public class Calculator {

    int weight=2;
    int cost=3;
    String color="Red";
    int x;
    int y;

    public Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Calculator(){

    }
    public Calculator(int weight, String color, int cost){
    this.weight=weight;
    this.color=color;
    this.cost=cost;
    }

    int summ(){
        return this.x+this.y;
    }
    int summ(int x, int y){
        return x+y;
    }

    int diff(){
        return this.x-this.y;
    }

    int mult(){
        return this.x*this.y;
    }

    int div(){
        return this.x/this.y;
    }

}
