package p4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) {

        try {
            LocateRegistry.createRegistry(2029);
            Adder stub = new RemoteAdder();
            Naming.rebind("rmi://localhost:2029/ds",stub);
        }catch (Exception error){
            System.out.println(error.getMessage());
            error.printStackTrace();
        }
    }
}
