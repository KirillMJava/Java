package HW.L8.Task1;

import HW.L8.Task1.Docs.Dentist;
import HW.L8.Task1.Docs.Doc;
import HW.L8.Task1.Docs.Surgeon;
import HW.L8.Task1.Docs.Therapist;

public class Scrubs {
    public static void main(String[] args) {

    Patient patient1=new Patient();
    Therapist therapist1=new Therapist();
    Doc surgeon1=new Surgeon();
    Doc dentist1=new Dentist();
    patient1.setTreatmentPlan("Surgery");
    therapist1.prescribeTreatment(patient1, surgeon1, dentist1, therapist1);

    }
}
