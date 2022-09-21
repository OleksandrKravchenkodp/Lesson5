package ua.com.hillel.kravchenko.lesson4.inspectors.classes;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Attestation;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.BeAMentor;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Study;

import javax.swing.text.Style;
import java.util.stream.Stream;

public final class TechnicalInspector extends Inspector implements Attestation, BeAMentor {

    private String rank;
    private int yearsOfExpirience;

    public TechnicalInspector(String rank, int yearsOfExpirience) {

        this.rank = rank;
        this.yearsOfExpirience = yearsOfExpirience;

    }

    @Override
    public void checkDriversWork() {

        if (rank == "Hight" && yearsOfExpirience >= 1) {
            System.out.println("The inspector can conduct a technical inspection of all parts");
        } else {
            System.out.println("The inspector is prohibited from servicing the main parts and electronics");
        }

    }

    @Override
    public void studyNewExperience() {
        System.out.println("Technical inspector must examine new truck parts");
    }

    @Override
    public void studyBeforeExam() {
        System.out.println("Once a year, the technical inspector must pass an exam");
    }

    @Override
    public void passAttestation() {
        System.out.println("Once every six months, the technical inspector must undergo attestation");
    }

    @Override
    public void setCertificate() {
        System.out.println("The technical inspector must has certificate");
    }

    @Override
    public void canTeachInspectors() {
        System.out.println("If the technical inspector has a certificate, he can be a mentor for new inspectors");
    }

    @Override
    public void canCheckInspectors() {
        System.out.println("Если технический инспектор имеет сертификат и два года опыта он может проверять других инспекторов");
    }

}
