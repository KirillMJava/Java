package HW.L9;

public class Animal {

    public Animal(){

    }

    public void voice (){
        System.out.println("My pet says:");
    }
    public void eat (String food){
        if (food.equals("Meat") || food.equals("Grass") || food.equals("Bones")){
            System.out.println("Nice choice, let's feed my pets!");
        } else System.out.println("Please, restart the program with the correct value (Bones/Grass/Meat)");
                  }


    }

