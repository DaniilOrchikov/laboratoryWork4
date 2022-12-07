package work;

import creature.Shorty;
import exceptions.WorkForFreeException;

public interface WorkI {
    public void obtainWork(Shorty shorty);

    public void writeDownTheName(Shorty shorty);

    public void payForServices(int price) throws WorkForFreeException;
}
