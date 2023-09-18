package HW.L8.Task1.Docs;

import HW.L8.Task1.Patient;

public class Therapist extends Doc{
    @Override
    void treat() {
        System.out.println("Treat u like no one does");
    }
     public void prescribeTreatment (Patient p1, Doc s1, Doc d1, Therapist t1){
        if (p1.getTreatmentPlan().equals("Surgery")){
            p1.setDoctor("Surgeon");
        s1.treat();
        } else if (p1.getTreatmentPlan().equals("DentStuff")) {
            p1.setDoctor("Dentist");
        d1.treat();
        } else if (p1.getTreatmentPlan().equals("Therapy")) {
            p1.setDoctor("Therapist");
        t1.treat();
        } else System.out.println("Wrong prescription");
    }
}
