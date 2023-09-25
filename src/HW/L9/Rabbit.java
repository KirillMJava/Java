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
        if (food.equals("Grass")) {
            System.out.println("Mmmm, really enjoy Grass!");
            System.out.println();
        } else if (food.equals("Meat") || food.equals("Bones")) {
            voice();
            System.out.println("It's not for me, I like Grass!");
            System.out.println();
        }
    }
}
