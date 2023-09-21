package HW.L9;

public class Animal {

    public Animal(){

    }

    public void voice (){
        System.out.println("My voice:");
    }
    public void eat (String food){
        if (food.equals("Meat") || food.equals("Grass") || food.equals("Bones")){
            System.out.println("I'm hungry! Let's have breakfast with:");
        } else System.out.println("Hmmm, I don't like it!!!");

        }

    }

