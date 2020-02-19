package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {

        UpperLimitedPositiveCounter uc = new UpperLimitedPositiveCounter(10, 15);

        System.out.println(uc.getValue());
        for (int i = 0; i < 5; i++){
            uc.inc();
        }
        System.out.println(uc.getValue());

        UpperLimitedPositiveCounter uc2 = new UpperLimitedPositiveCounter(15);

        uc2.add(15);


    }
}
