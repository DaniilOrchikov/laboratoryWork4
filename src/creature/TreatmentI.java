package creature;

import exceptions.WorkForFreeException;

public interface TreatmentI {
    public void cureSomeone(Creature creature, int price) throws WorkForFreeException;
}
