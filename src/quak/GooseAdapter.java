package quak;

public class GooseAdapter implements Quakable{
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
