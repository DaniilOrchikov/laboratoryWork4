import creature.*;
import exceptions.WorkForFreeException;
import factors.HealthStatus;
import factors.Speed;
import factors.Surfaces;
import work.Work;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Shorty ill = new Shorty("Больной", 'm');
        ill.setHealthStatus(HealthStatus.GETTINGWORSE);
        Doctor doctor = new Doctor();
        She she = new She();
        She.PetsContainer shePetContainer = she.getPetsContainer();
        Dog pet1 = shePetContainer.getPet(1), pet2 = shePetContainer.getPet(2);
        Shorty maid = new Shorty("Служанка", 'f');
        Dunno dunno = new Dunno();
        Work work = new Work("Контора по найму собачьих нянь");
        UnaryOperator<String> signboard = new UnaryOperator<String>() {
            @Override
            public String apply(String title) {
                return "Вывеска, на которой написанно " + title;
            }
        };
        ill.getHealthStatus();
        try {
            doctor.cureSomeone(ill, dunno.getBudget());
        } catch (WorkForFreeException ex) {
            System.out.println("Недостаточно денег. " + ex.getMessage());
        }
        work.obtainWork(dunno);
        dunno.go(Surfaces.STREET);
        dunno.see(signboard.apply(work.getName()));
        dunno.enter();
        System.out.println(work.getOfficeDescription());
        work.putOn(dunno);
        dunno.asked("кто такие собачьи няни и для чего их нанимают", new Shorty('m'));
        pet1.enter();
        System.out.println(shePetContainer.getPetLook(1));
        she.enter();
        System.out.println(she.getLook());
        maid.enter();
        pet2.enter();
        System.out.println(shePetContainer.getPetLook(2));
        dunno.bowDown();
        she.removeTheLeashFromThePet();
        pet1.go(dunno, Speed.SLOWLY);
        pet1.sniff(dunno);
        pet1.sniff(dunno.getBoots());
        pet1.lickOnTheCheek(dunno);
        pet1.sit(Surfaces.FLOOR);
        pet2.go(dunno, Speed.QUICKLY);
        pet2.sit(Surfaces.FLOOR);
        dunno.sit();
        pet1.stroke(dunno);
        pet2.stroke(dunno);
        work.writeDownTheName(dunno);
        work.writeDownTheName(she);
        work.getEmployee().speak("Уплатите за услуги фертинг", dunno);
        try {
            work.payForServices(dunno.getBudget());
        } catch (WorkForFreeException ex) {
            System.out.println("Если недостаточно денег " + ex.getMessage().toLowerCase());
        }
        dunno.escape();
        pet1.escape();
        pet2.escape();
        she.escape();
        maid.escape();
    }
}