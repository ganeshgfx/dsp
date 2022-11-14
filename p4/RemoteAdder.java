package p4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements Adder {

    RemoteAdder()throws RemoteException{
        super();
    }
    @Override
    public int add(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public String printLength(String s) throws RemoteException {
        return "String length is : "+s.length();
    }
}
