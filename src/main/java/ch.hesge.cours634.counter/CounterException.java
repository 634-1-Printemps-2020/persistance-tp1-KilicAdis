package ch.hesge.cours634.counter;

public class CounterException extends Exception {

    public String toString(){
        return "The value exceeds the maximum value";
    }

}
