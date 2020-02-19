package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private int max;

    public UpperLimitedPositiveCounter(int value, int max){
        super(value);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        if(0 < super.getValue() && super.getValue() < max){
            super.inc();
        }else{
            throw new CounterException();
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if(0 < super.getValue() && super.getValue() < max){
            super.add(step);
        }else{
            throw new CounterException();
        }
    }

    @Override
    public int getValue() {
        return super.getValue();
    }
}
