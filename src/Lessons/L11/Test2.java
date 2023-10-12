package Lessons.L11;

import java.rmi.RemoteException;

public class Test2 {

    public static boolean smth(double asd) throws RemoteException{
    throw new RemoteException();

    }

    public static void main(String[] args) throws RemoteException {
        System.out.println(smth(123));

    }
}
