package ua.com.hillel.kravchenko.lesson4.drivers.clasess;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.DayOff;

public final class GarbageTruckDriver extends TruckDriver implements DayOff {

    public GarbageTruckDriver(int yarsOfExperience, int numberOfPenaltyPoints) {

        super(yarsOfExperience, numberOfPenaltyPoints);

    }

    @Override
    public void workPermit() {

        if (yarsOfExperience > 2 && numberOfPenaltyPoints < 4) {

            System.out.println("Permission received only in yoyr area");
        } else {

            System.out.println("Permission not received. Contact the inspector");

        }

    }

    @Override
    public void relaxForDrivers() {
        System.out.println("Garbage truck driver prohibited from working more than 12 hours a day");
    }

    @Override
    public void timeOfWorkForDrivers() {
        System.out.println("If the garbage truck driver worked 6 days, he must take a day off");
    }

    @Override
    public void timeOffForDrivers() {
        System.out.println("The garbage truck driver must have at least 5 days off per month");
    }

    @Override
    public void vacationForDrivers() {
        System.out.println("Every half a year the garbage truck driver must have a short vacation");
    }
}
