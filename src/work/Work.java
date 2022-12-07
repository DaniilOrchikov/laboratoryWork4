package work;

import creature.Shorty;
import exceptions.WorkForFreeException;
import thing.PlaceToSit;

public class Work implements WorkI, OfficeI {
    private final String name;
    private final Office office = new Office();
    private final Shorty employee = new Shorty("Сотрудник", 'm');

    public Work(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void obtainWork(Shorty shorty) {
        System.out.println(shorty.getName() + " удалось устроится на работу " + this);
        shorty.setJob(this);
    }

    public String getOfficeDescription() {
        return toString();
    }

    @Override
    public void writeDownTheName(Shorty shorty) {
        System.out.println(employee.getName() + " записал имя " + shorty.getName());
    }

    @Override
    public void payForServices(int price) throws WorkForFreeException {
        int servicePrice = 60;
        if (price < servicePrice) throw new WorkForFreeException("Принесите фертинг, как только получите жалованье");
        else System.out.println("Услуга оплачена");
    }

    public Shorty getEmployee() {
        return employee;
    }

    public void putOn(Shorty shorty) {
        office.bench.putOn(shorty);
    }

    @Override
    public String toString() {
        return "\"" + getName() + "\"";
    }

    private class Office {
        private final PlaceToSit bench =
                new PlaceToSit("Лавочка", new Shorty('m'), new Shorty('f'), new Shorty('f'));

        @Override
        public String toString() {
            return "Комната в которой " + bench + ", " + employee.whatTtDoes("сидит и с кем-то разговаривает по телефону");
        }
    }
}
