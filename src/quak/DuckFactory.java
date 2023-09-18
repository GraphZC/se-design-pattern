package quak;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quakable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quakable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quakable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quakable createRubberDuck() {
        return new RedheadDuck();
    }
}
