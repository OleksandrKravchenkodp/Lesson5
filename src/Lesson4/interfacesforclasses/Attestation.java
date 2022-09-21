package ua.com.hillel.kravchenko.lesson4.interfacesforclasses;

public interface Attestation extends Study {

    public void passAttestation();

    public void setCertificate();

    @Override
    void studyNewExperience();

    @Override
    void studyBeforeExam();

}
