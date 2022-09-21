package ua.com.hillel.kravchenko.lesson4;

import ua.com.hillel.kravchenko.lesson4.drivers.clasess.BusDriver;
import ua.com.hillel.kravchenko.lesson4.drivers.clasess.FireEngineDriver;
import ua.com.hillel.kravchenko.lesson4.drivers.clasess.GarbageTruckDriver;
import ua.com.hillel.kravchenko.lesson4.inspectors.classes.InsuranceInspector;
import ua.com.hillel.kravchenko.lesson4.inspectors.classes.MedicalInspector;
import ua.com.hillel.kravchenko.lesson4.inspectors.classes.TechnicalInspector;

public class Main {

    public static void main(String[] args) {

        System.out.println("Info about Truck drivers");
        System.out.println("");

        FireEngineDriver fireEngineDriver = new FireEngineDriver(5, 0);
        BusDriver busDriver = new BusDriver(2, 2);
        GarbageTruckDriver garbageTruckDriver = new GarbageTruckDriver(2, 3);

        fireEngineDriver.workPermit();
        fireEngineDriver.relaxForDrivers();
        fireEngineDriver.timeOffForDrivers();
        fireEngineDriver.timeOfWorkForDrivers();
        fireEngineDriver.vacationForDrivers();

        System.out.println("-------------------------------");

        busDriver.workPermit();
        busDriver.relaxForDrivers();
        busDriver.timeOffForDrivers();
        busDriver.timeOfWorkForDrivers();
        busDriver.vacationForDrivers();

        System.out.println("-------------------------------");

        garbageTruckDriver.workPermit();
        garbageTruckDriver.relaxForDrivers();
        garbageTruckDriver.timeOffForDrivers();
        garbageTruckDriver.timeOfWorkForDrivers();
        garbageTruckDriver.vacationForDrivers();


        System.out.println("-------------------------------");
        System.out.println("-------------------------------");


        System.out.println("");
        System.out.println("Info about Inspectors");

        InsuranceInspector insuranceInspector = new InsuranceInspector("Midle", 1);
        MedicalInspector medicalInspector = new MedicalInspector("Hight", 2);
        TechnicalInspector technicalInspector = new TechnicalInspector("Hight", 1);

        insuranceInspector.checkDriversWork();
        insuranceInspector.studyNewExperience();
        insuranceInspector.studyBeforeExam();
        insuranceInspector.passAttestation();
        insuranceInspector.setCertificate();
        insuranceInspector.canTeachInspectors();
        insuranceInspector.canCheckInspectors();

        System.out.println("-------------------------------");

        medicalInspector.checkDriversWork();
        medicalInspector.studyNewExperience();
        medicalInspector.studyBeforeExam();
        medicalInspector.passAttestation();
        medicalInspector.setCertificate();
        medicalInspector.canTeachInspectors();
        medicalInspector.canCheckInspectors();

        System.out.println("-------------------------------");

        technicalInspector.checkDriversWork();
        technicalInspector.studyNewExperience();
        technicalInspector.studyBeforeExam();
        technicalInspector.passAttestation();
        technicalInspector.setCertificate();
        technicalInspector.canTeachInspectors();
        technicalInspector.canCheckInspectors();

    }
}