package creature;

import thing.Thing;

public interface SniffI {
    public void sniff(Creature... creatures);

    public void sniff(Thing... things);
}
