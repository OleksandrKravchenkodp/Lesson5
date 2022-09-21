package ua.com.hillel.kravchenko.lesson4.drivers.clasess;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.DayOff;

public final class FireEngineDriver extends TruckDriver implements DayOff {

    public FireEngineDriver(int yarsOfExperience, int numberOfPenaltyPoints) {

        super(yarsOfExperience, numberOfPenaltyPoints);

    }

    @Override
    public void workPermit() {

        if (yarsOfExperience > 2 && numberOfPenaltyPoints < 2) {

            System.out.println("Permission received");
        } else {

            System.out.println("Permission not received. Contact the inspector");

        }

    }

    @Override
    public void relaxForDrivers() {
        System.out.println("Fire truck driver prohibited from working more than 7 hours a day");
    }

    @Override
    public void timeOfWorkForDrivers() {
        System.out.println("If the fire truck driver worked 5 days, he must take a day off");
    }

    @Override
    public void timeOffForDrivers() {
        System.out.println("The bus driver must have at least 7 days off per month");
    }

    @Override
    public void vacationForDrivers() {
        System.out.println("Every half a year the fire truck driver must have a short vacation");
    }
}
