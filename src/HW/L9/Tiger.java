package HW.L9;

public class Tiger extends Animal {

    @Override
    public void voice() {
        super.voice();
        System.out.print("Rrrrrrr");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        if (food.equals("Meat")) {
            voice();
            System.out.println("really enjoy Meat!");
            System.out.println();
        } else if (food.equals("Bones") || food.equals("Grass")) {
            voice();
            System.out.println();
            System.out.println("It's not for me, I like Meat!");
            System.out.println();
        }
    }
}
