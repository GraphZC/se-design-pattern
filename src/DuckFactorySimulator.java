import quak.*;

public class DuckFactorySimulator {
    void simulate(Quakable duck) {
        duck.quack();
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quakable mallardDuck = duckFactory.createMallardDuck();
        Quakable redheadDuck = duckFactory.createRedheadDuck();
        Quakable duckCall = duckFactory.createDuckCall();
        Quakable rubberDuck = duckFactory.createRubberDuck();
        Quakable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfRubber = new Flock();
        flockOfRubber.add(new RubberDuck());
        flockOfRubber.add(new RubberDuck());

        flockOfDucks.add(flockOfRubber);

        System.out.println("======================");
        System.out.println(" DuckFactorySimulator");
        System.out.println("======================");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(flockOfDucks);

        System.out.println("Num quacks: " + QuakCounter.getQuacks());
    }

    public static void main(String[] args) {
        DuckFactorySimulator duckFactory = new DuckFactorySimulator();
        duckFactory.simulate(new CountingDuckFactory());
    }
}
