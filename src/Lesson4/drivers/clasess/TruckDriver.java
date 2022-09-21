package ua.com.hillel.kravchenko.lesson4.drivers.clasess;

public abstract class TruckDriver extends Driver {
    int yarsOfExperience;
    int numberOfPenaltyPoints;

    public TruckDriver(int yarsOfExperience, int numberOfPenaltyPoints) {
        this.yarsOfExperience = yarsOfExperience;
        this.numberOfPenaltyPoints = numberOfPenaltyPoints;
    }

    @Override
    public void workPermit() {
        super.workPermit();
    }
}
