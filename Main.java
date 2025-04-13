//Main.java
//Name: Riddhi Poddar
//PRN: 2307016105
//Batch: B2

public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread(1, 2, 300)).start();
        new Thread(new MyThread(100, 20, 1000)).start();
    }
}

