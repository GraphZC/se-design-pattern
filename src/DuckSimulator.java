import quak.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quakable mallardDuck = new MallardDuck();
        Quakable redheadDuck = new RedheadDuck();
        Quakable duckCall = new DuckCall();
        Quakable rubberDuck = new RubberDuck();
        Quakable goose = new GooseAdapter(new Goose());
        Quakable pigeon = new PigeonAdapter(new Pigeon());


        System.out.println("===============");
        System.out.println(" DuckSimulator");
        System.out.println("===============");
        simulate(pigeon);
        simulate(new QuakCounter(new QuakEcho(mallardDuck)));
        System.out.println(QuakCounter.getQuacks());
    }

    void simulate(Quakable duck) {
        duck.quack();
    }
}
