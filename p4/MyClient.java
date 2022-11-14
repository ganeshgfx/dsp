package p4;

import java.rmi.Naming;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String : ");
        String s = input.nextLine();
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        try{
           // LocateRegistry.createRegistry(2089);
            Adder stub = (Adder) Naming.lookup("rmi://localhost:2049/ds");
            System.out.println("\nAnswer : "+stub.add(a,b));
            System.out.println(stub.printLength(s));
        }catch (Exception error){
            System.out.println(error.getMessage());
            error.printStackTrace();
        }
    }
}
