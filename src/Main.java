import model.Doctor;
import model.IsSchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Anahi.Salgado@test.com");
        myDoctor.addAvalaibleAppoiment(new Date(), "4 pm");
        myDoctor.addAvalaibleAppoiment(new Date(), "10pm");
        myDoctor.addAvalaibleAppoiment(new Date(), "1pm");

        for (Doctor.AvailableAppoiment aA: myDoctor.getAvailableAppoiment()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejadra", "alejandra@test.com");
        Patient patient1 = new Patient("Anahi", "anahi@test.com");

        System.out.println(patient);
        System.out.println(myDoctor);

        User user1 = new User("Anahí", "ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Green Cross");
                System.out.println("Department: Geriatric");
            }
        };

        user1.showDataUser();

        IsSchedulable isSchedulable = new IsSchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
    }
}
