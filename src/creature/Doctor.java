package creature;

import exceptions.WorkForFreeException;

public class Doctor extends Shorty implements TreatmentI {

    public Doctor() {
        super("Доктор", 'm');
    }

    public void cureSomeone(Creature creature, int price) throws WorkForFreeException {
        int costOfService = 100;
        if (price < costOfService) throw new WorkForFreeException("Никакой врач не станет лечить больного бесплатно");
        System.out.println(getName() + " вылечил больного " + creature.getName());
    }
}
