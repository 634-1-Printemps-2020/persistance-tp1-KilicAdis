package ch.hesge.cours634.counter;

public class CounterException extends Exception {
    private String err;
    public CounterException(String err){
        this.err = err;
    }

    public String toString(){
        if(this.err.equals("minus")){
            return "The value can not be negative";
        }else if (this.err.equals("maximum")){
            return "The value exceeds the maximum value";
        }

        return "";
    }

}
