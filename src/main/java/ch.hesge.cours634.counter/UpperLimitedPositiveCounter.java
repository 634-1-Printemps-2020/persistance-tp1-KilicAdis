package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private int max;

    public UpperLimitedPositiveCounter(int value, int max){
        super(value);
        this.max = max;
    }

    public UpperLimitedPositiveCounter(int max){
        super(0);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        if(0 < super.getValue() && super.getValue() < max){
            super.inc();
        }else{
            throw new CounterException("maximum");
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if(super.getValue() + step < 0 || super.getValue() < 0){
            throw new CounterException("minus");
        }else if(super.getValue()+step > max || super.getValue() > max){
            throw new CounterException("maximum");
        }else{
            super.add(step);
        }
    }

    @Override
    public int getValue() {
        return super.getValue();
    }
}
