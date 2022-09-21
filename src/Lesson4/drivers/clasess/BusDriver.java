package ua.com.hillel.kravchenko.lesson4.drivers.clasess;

import ua.com.hillel.kravchenko.lesson4.interfacesforclasses.DayOff;

public final class BusDriver extends TruckDriver implements DayOff {

    public BusDriver(int yarsOfExperience, int numberOfPenaltyPoints) {

        super(yarsOfExperience, numberOfPenaltyPoints);

    }

    @Override
    public void workPermit() {

        if (yarsOfExperience > 2 && numberOfPenaltyPoints < 2) {

            System.out.println("Permission received only with corporate buses");
        } else {

            System.out.println("Permission not received. Contact the inspector");

        }

    }

    @Override
    public void relaxForDrivers() {
        System.out.println("If the operating time exceeds 7 hours, the bus must be driven by two drivers in turn");
    }

    @Override
    public void timeOfWorkForDrivers() {
        System.out.println("If the bus driver worked 6 days, he must take a day off");
    }

    @Override
    public void timeOffForDrivers() {
        System.out.println("The bus driver must have at least 5 days off per month");
    }

    @Override
    public void vacationForDrivers() {
        System.out.println("Every half a year the bus driver must have a short vacation");
    }

}
