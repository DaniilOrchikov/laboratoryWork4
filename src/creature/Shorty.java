package creature;

import factors.HealthStatus;
import work.Work;

public class Shorty extends Creature implements SpeakI, BowDownI {
    private HealthStatus healthStatus = HealthStatus.WITHOUTCHANGES;
    private int budget = 0;
    private Work job = null;

    public Shorty(char gender) {
        super("коротышка", gender);
    }

    public Shorty(String name, char gender) {
        super(name, gender);
    }

    public Shorty(String name, char gender, int budget) {
        super(name, gender);
        this.budget = budget;
    }
    public void setHealthStatus(HealthStatus healthStatus){
        this.healthStatus = healthStatus;
    }

    public void bowDown() {
        System.out.println(getName() + (getGender() == 'f' ? " поклонилась " : " поклонился "));
    }

    public void speak(String str) {
        System.out.println(getName() + (getGender() == 'f' ? " сказала " : " сказал " + str));
    }
    public void speak(String str, Shorty shorty) {
        System.out.println(getName() + (getGender() == 'f' ? " сказала " : " сказал ") + shorty.getName() + ' ' + str);
    }

    public void asked(String str, Shorty shorty) {
        System.out.println(getName() + " спросил у " + shorty.getName() + ' ' + str);
    }
    @Override
    public String toString() {
        return "Коротышка " + (getGender() == 'f' ? "девочка" : "мальчик") + " по имени " + this.getName() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty s = (Shorty) o;
        return getId() == s.getId();
    }

    public int getBudget() {
        return budget;
    }

    public void setJob(Work work) {
        this.job = work;
    }

    public void getHealthStatus() {
        System.out.println(getName() + ' ' + healthStatus);
    }
}
