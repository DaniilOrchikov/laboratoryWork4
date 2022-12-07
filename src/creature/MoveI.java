package creature;

import factors.Speed;
import factors.Surfaces;

public interface MoveI {

    public String whatTtDoes(String str);

    public void sit();

    public void sit(Surfaces surf);

    public void go(Creature creature, Speed speed);

    public void go(Surfaces surface);

    public void enter();

    public void escape();
}
