package ua.com.hillel.kravchenko.lesson4.inspectors.classes;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Attestation;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.BeAMentor;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Study;

public final class InsuranceInspector extends Inspector implements Attestation, BeAMentor {

    private String rank;
    private int yearsOfExpirience;

    public InsuranceInspector(String rank, int yearsOfExpirience) {

        this.rank = rank;
        this.yearsOfExpirience = yearsOfExpirience;

    }

    public void checkDriversWork() {

        if (rank == "Midle" && yearsOfExpirience >= 1) {
            System.out.println("The insurance inspector can authorize the operation of all cars and trucks");
        } else {
            System.out.println("The insurance inspector can authorize the operation only Garbage truck");
        }

    }

    @Override
    public void studyNewExperience() {
        System.out.println("Insuranse incpector must know all company affiliations");
    }

    @Override
    public void studyBeforeExam() {
        System.out.println("The insuranse incpector must take an exam every six months");
    }

    @Override
    public void passAttestation() {
        System.out.println("In order to be allowed to work, the insuranse incpector must pass attestation");
    }

    @Override
    public void setCertificate() {
        System.out.println("Insuranse incpector must has a certificate after attestation");
    }

    @Override
    public void canTeachInspectors() {
        System.out.println("If insuranse incpector has more than 2 years of experience, he can train other inspectors");
    }

    @Override
    public void canCheckInspectors() {
        System.out.println("If insuranse incpector has more than 2 years of experience, he can check knowlege new inspectors");
    }
}
