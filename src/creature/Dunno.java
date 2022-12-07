package creature;

import thing.Thing;

public class Dunno extends Shorty {
    private final Thing.Boots boots = new Thing.Boots("ботинки", 2.3f);

    public Dunno() {
        super("Незнайка", 'm', 23);
    }

    public Thing getBoots() {
        return boots;
    }
}
