package ua.com.hillel.kravchenko.lesson4.inspectors.classes;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Attestation;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.BeAMentor;
import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.Study;

import javax.tools.StandardJavaFileManager;

public final class MedicalInspector extends Inspector implements Attestation, BeAMentor {

    private String rank;
    private int yearsOfExpirience;

    public MedicalInspector(String rank, int yearsOfExpirience) {

        this.rank = rank;
        this.yearsOfExpirience = yearsOfExpirience;

    }

    @Override
    public void checkDriversWork() {

        if (rank == "Hight" && yearsOfExpirience >= 2) {
            System.out.println("The inspector can check all drivers");
        } else {
            System.out.println("The inspector can check only Truck drivers and Fire engine drivers");
        }

    }

    @Override
    public void studyNewExperience() {
        System.out.println("The medical inspector required to attend training every six months");
    }

    @Override
    public void studyBeforeExam() {
        System.out.println("The medical inspector is required to complete a training course before passing the exam");
    }

    @Override
    public void passAttestation() {
        System.out.println("The medical inspector must be certified every year");
    }

    @Override
    public void setCertificate() {
        System.out.println("The medical inspector must have a certificate to check drivers before work");
    }

    @Override
    public void canTeachInspectors() {
        System.out.println("If a medical inspector has more than two years of experience, he may train other inspectors");
    }

    @Override
    public void canCheckInspectors() {
        System.out.println("If the medical inspector is in the lead position in the department, he must check other inspectors");
    }
}
