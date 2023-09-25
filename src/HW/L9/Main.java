package HW.L9;

public class Main {
    public static void main(String[] args) {
        Animal dog1=new Dog();
        Animal tiger1=new Tiger();
        Animal raymond=new Rabbit();
        dog1.eat("Bones");
        tiger1.eat("Meat");
        raymond.eat("Grass");
        dog1.eat("Meat");
        tiger1.eat("Grass");
        raymond.eat("Orange");
    }
}
