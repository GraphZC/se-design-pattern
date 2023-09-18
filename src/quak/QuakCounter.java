package quak;

public class QuakCounter implements Quakable {
    private static int numberOfQuacks = 0;
    private Quakable duck;
    public QuakCounter(Quakable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
