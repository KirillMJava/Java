package Lessons.L13_Collections.Generic.Robot;

public class Robot_Main {
    public static void main(String[] args) {
        Body body=new Body();

        SmalHad smalHad=new SmalHad();
        MediumHad mediumHad=new MediumHad();
        BigHad bigHad=new BigHad();
        Leg leg=new Leg();

        Robot<SmalHad> robot=new Robot<SmalHad>(body, smalHad);
        Robot<BigHad> robot1=new Robot<>(body, bigHad);

        Robot robot2=new Robot(body, smalHad);
        Robot<SmalHad> robot3= new Robot<SmalHad>(body, smalHad);
        Robot<MediumHad> robot4=new Robot<>(body, mediumHad);


    }
}
