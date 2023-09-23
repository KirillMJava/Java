package HW.L9;

public class Dog extends Animal {

    @Override
    public void voice() {
        super.voice();
        System.out.println("GAVVV");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Bones")) {
            voice();
            System.out.println("Mmmm, really enjoy Bones!");
            System.out.println();
        } else if (food.equals("Meat") || food.equals("Grass")) {
            voice();
            System.out.println("It's not for me, I like Bones!");
            System.out.println();
        }
    }
}