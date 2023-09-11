package HW.L6;

public class HW_L6 {
    public static void main(String[] args) {
    Calculator calc=new Calculator(10,5);
    Calculator calc2=new Calculator(10, "red",20);
        System.out.println("Task1");
        System.out.println("Summ:"+calc.summ());
        System.out.println("Diff:"+calc.diff());
        System.out.println("Mult:"+calc.mult());
        System.out.println("Div:"+calc.div());
        System.out.println(calc.color);
        System.out.println(calc.cost);
        System.out.println(calc.weight);

        System.out.println("Task2");
        Person vova=new Person();
        vova.fullName="Vova";
        Person evgeny=new Person("evgeny", 10);
        evgeny.talk("Hello!");
        vova.talk("Hi!");
        evgeny.move();
        vova.move();


    }
}
