package quak;

public class CounterEchoDuckFactory extends AbstractDuckFactory {
    private Quakable createCounterEcho(Quakable duck) {
       return new QuakCounter(new QuakEcho(duck));
    }
    @Override
    public Quakable createMallardDuck() {
        return createCounterEcho(new MallardDuck());
    }

    @Override
    public Quakable createRedheadDuck() {
        return createCounterEcho(new RedheadDuck());
    }

    @Override
    public Quakable createDuckCall() {
        return createCounterEcho(new DuckCall());
    }

    @Override
    public Quakable createRubberDuck() {
        return createCounterEcho(new RedheadDuck());
    }
}
