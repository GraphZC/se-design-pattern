import quak.*;

public class FloakDuckSimulator {
    public static void main(String[] args) {
        Quakable mallardDuck = new MallardDuck();
        Quakable redheadDuck = new RedheadDuck();
        Quakable rubberDuck = new RubberDuck();
        Quakable goose = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator: With quak.Goose Adapter");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);
        simulate(flockOfDucks);
    }

    private static void simulate(Quakable duck) {
        duck.quack();
    }
}
