package ua.com.hillel.kravchenko.lesson4.inspectors.classes;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Attestation;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.BeAMentor;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Study;

public abstract class Emploee implements Study, Attestation, BeAMentor {

    private String rank;
    private int yearsOfExpirience;

    void checkDriversWork() {

    }

    @Override
    public void studyNewExperience() {

    }

    @Override
    public void studyBeforeExam() {

    }

    @Override
    public void passAttestation() {

    }

    @Override
    public void setCertificate() {

    }

    @Override
    public void canTeachInspectors() {

    }

    @Override
    public void canCheckInspectors() {

    }

}
