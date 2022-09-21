package ua.com.hillel.kravchenko.lesson4.inspectors.classes;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Attestation;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.BeAMentor;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Study;

public abstract class Inspector extends Emploee implements Study, Attestation, BeAMentor {

    private String rank;
    private int yearsOfExpirience;

    void checkDriversWork() {

    }

    @Override
    public void studyNewExperience() {
        super.studyNewExperience();
    }

    @Override
    public void studyBeforeExam() {
        super.studyBeforeExam();
    }

    @Override
    public void passAttestation() {
        super.passAttestation();
    }

    @Override
    public void setCertificate() {
        super.setCertificate();
    }

    @Override
    public void canTeachInspectors() {
        super.canTeachInspectors();
    }

    @Override
    public void canCheckInspectors() {
        super.canCheckInspectors();
    }

}
