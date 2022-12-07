package creature;

public class She extends Shorty implements RemoveTheLeashFromThePetI {
    private final Dog poodle = new Dog("Пудель", 'm', this);
    private final Dog smallDog = new Dog("Собаченка", 'f', this);
    private final String poodleLook = "Большой белый с заплетенной в косички гривой и пушистой кисточкой на хвосте";
    private final String smallDogLook = "Курносая, с головы до хвоста покрытая рыженькими кудряшками";
    private final String look = "В пышном газовом платье и большой модной шляпе, напоминавшей корзину с цветами";

    public She() {
        super("Госпожа Минога", 'f');

    }

    public interface PetsContainer {
        String getPetLook(int petNum);

        Dog getPet(int petNum);
    }

    public PetsContainer getPetsContainer() {
        class ShePetsContainer implements PetsContainer {

            @Override
            public String getPetLook(int petNum) {
                if (petNum < 1 || petNum > 2) throw new IndexOutOfBoundsException("Неверный номер питомца");
                return (petNum == 1 ? poodleLook : smallDogLook);
            }

            @Override
            public Dog getPet(int petNum) {
                if (petNum < 1 || petNum > 2) throw new IndexOutOfBoundsException("Неверный номер питомца");
                return (petNum == 1 ? poodle : smallDog);
            }
        }
        return new ShePetsContainer();
    }

    public void removeTheLeashFromThePet() {
        poodle.removeTheLeash();
    }

    @Override
    public String toString() {
        return super.toString() + " Владеет домашними животными: " + this.poodle + ", " + this.smallDog;
    }

    public String getLook() {
        return look;
    }
}
