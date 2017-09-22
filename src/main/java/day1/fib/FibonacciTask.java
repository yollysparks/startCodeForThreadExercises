package day1.fib;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTask extends Thread{
    private long tal;
    List<FibonacciObserver> observers = new ArrayList();
   List<FibonacciObserver> listeners = new ArrayList();
    public void registerFibonacciObserver(FibonacciObserver o){
      observers.add(o);
    }
    
    public FibonacciTask(long n) {
        this.tal = n;
    }
    @Override
    public void run() {
    FibonacciTask ft = new FibonacciTask(10);
        long numb = ft.tal;
         observers.stream().map((observer) -> {
            observer.dataReady(tal);
            return observer;
        }).forEachOrdered((_item) -> {
            System.out.println("returning observers"+numb);
        });
    }
}
//Call the Fibonacci method from here
        //long tal = ......
