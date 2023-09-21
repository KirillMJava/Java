package HW.L9;

public class Dog extends Animal{

    @Override
    public void voice() {
        super.voice();
        System.out.println("GAVVV");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Bones")){
            System.out.println("Mmm, so good!");
        } else System.out.println("It's not for me, don't u understand?");
    }
}
