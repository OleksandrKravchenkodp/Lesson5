package ua.com.hillel.kravchenko.lesson4.interfacesforclasses;

public interface DayOff extends Relax {

    @Override
    public void relaxForDrivers();

    @Override
    public void timeOfWorkForDrivers();

    public void timeOffForDrivers();

    public void vacationForDrivers();

}
