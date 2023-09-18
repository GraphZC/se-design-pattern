package quak;

public class QuakEcho implements Quakable {
    private final Quakable duck;
    public QuakEcho(Quakable duck) {
       this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo: ");
        duck.quack();
    }
}
