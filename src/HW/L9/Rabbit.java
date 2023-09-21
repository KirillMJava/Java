package HW.L9;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("AAAAAA");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Grass")){
            System.out.println("Mmm, so good!");
        } else System.out.println("It's not for me, don't u understand?");
    }
}
