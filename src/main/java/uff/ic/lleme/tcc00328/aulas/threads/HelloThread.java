package uff.ic.lleme.tcc00328.aulas.threads;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
        System.out.println("Main thread!");
    }

}
