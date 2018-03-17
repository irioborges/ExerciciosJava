package asp06.pkg1;

import java.lang.Thread;

public class ASP061 {

    public static void main(String[] args) {
           System.out.println("Creating threads");
                      
           Thread thread1 = new Thread(new Primos(1, 10000));
           Thread thread2 = new Thread(new Primos(10001,19999));
           Thread thread3 = new Thread(new Primos(20001,29999));
           Thread thread4 = new Thread(new Primos(30001,39999));
           Thread thread5 = new Thread(new Primos(40001,49999));
           Thread thread6 = new Thread(new Primos(50001,59999));
           Thread thread7 = new Thread(new Primos(60001,69999));
           Thread thread8 = new Thread(new Primos(70001,79999));
           Thread thread9 = new Thread(new Primos(80001,89999));
           Thread thread10 = new Thread(new Primos(90001,99999));
           
           System.out.println("Threads created, starting tasks.");
           
           thread1.start();
           thread2.start();
           thread3.start();
           thread4.start();
           thread5.start();
           thread6.start();
           thread7.start();
           thread8.start();
           thread9.start();
           thread10.start();
                            
           System.out.println("Tasks created, main ends. \n");
           
    }
    
}
