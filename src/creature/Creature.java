package creature;

import exceptions.WrongGender;
import factors.Speed;
import factors.Surfaces;

public abstract class Creature implements MoveI, SeeI {
    private static int id;
    private final int objId;
    private final String name;
    private final char gender;

    public Creature(String name, char gender) {
        this.name = name;
        if (gender != 'f' && gender != 'm') throw new WrongGender();
        this.gender = gender;
        id += 1;
        objId = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return objId;
    }

    public char getGender() {
        return gender;
    }

    public void go(Creature creature, Speed speed) {
        System.out.println(getName() + " " + speed + (getGender() == 'm' ? " подошел" : " подошла") + " к " + creature.getName());
    }

    public void go(Surfaces surface) {
        System.out.println(getName() + (getGender() == 'm' ? " пошел" : " пошла") + " по " + surface);
    }

    public void sit(Surfaces surf) {
        System.out.println(getName() + (getGender() == 'm' ? " сел " : " села ") + "на " + surf);
    }

    public void sit() {
        System.out.println(getName() + (getGender() == 'm' ? " сел " : " села "));
    }

    public String whatTtDoes(String str) {
        return getName() + ' ' + str;
    }

    public void see(String str) {
        System.out.println(getName() + (getGender() == 'm' ? " увидел" : " увидела") + ' ' + str);
    }

    public void enter() {
        System.out.println(getName() + (getGender() == 'm' ? " вошел" : " вошла") + " в дверь");
    }

    public void escape() {
        System.out.println(getName() + (getGender() == 'f' ? " ушла" : " ушел"));
    }

    @Override
    public int hashCode() {
        return objId;
    }
}

