package creature;

import thing.Thing;

public class Dog extends Creature implements SniffI, LickI, InteractionWithTheDogI {
    private final Shorty owner;

    public Dog(String name, char gender, Shorty owner) {
        super(name, gender);
        this.owner = owner;
    }

    public void sniff(Thing... things) {
        System.out.print(getName() + (getGender() == 'f' ? " обнюхала " : " обнюхал "));
        System.out.print(things[0].getType());
        for (int i = 1; i < things.length; i++) {
            System.out.print(things[i].getType() + ", ");
        }
        System.out.println();
    }

    public void sniff(Creature... creatures) {
        System.out.print(getName() + (getGender() == 'f' ? " обнюхала " : " обнюхал "));
        System.out.print(creatures[0].getName());
        for (int i = 1; i < creatures.length; i++) {
            System.out.print(creatures[i].getName() + ", ");
        }
        System.out.println();
    }

    public void lickOnTheCheek(Creature creature) {
        System.out.println(getName() + (getGender() == 'f' ? " лизнула " : " лизнул ") + creature.getName() + " в щеку");
    }

    public void lick(Thing thing) {
        System.out.println(getName() + (getGender() == 'f' ? " облизала " : " облизал ") + thing.getType());
    }

    public void removeTheLeash() {
        System.out.println((owner.getGender() == 'f' ? "Хозяйка сняла с " : "Хозяин снял с") + getName() + " поводок");
    }

    @Override
    public void stroke(Shorty shorty) {
        System.out.println(shorty.getName() + (shorty.getGender() == 'f' ? " погладила " : " погладил ") + getName());
    }

    @Override
    public String toString() {
        return "Собака " + (getGender() == 'f' ? "девочка" : "мальчик") + " по имени " + this.getName() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog d = (Dog) o;
        return getId() == d.getId();
    }
}
