package quak;

import java.util.List;
import java.util.ArrayList;

public class Flock implements Quakable {
    private final List<Quakable> quackers;
    public Flock() {
        quackers = new ArrayList<>();
    }

    public void add(Quakable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        int i = 0;
        for (Quakable quacker : quackers) {
            if (i == 0) {
                quacker.quack();
                quacker.quack();
            }
            quacker.quack();
            i++;
        }
    }
}
