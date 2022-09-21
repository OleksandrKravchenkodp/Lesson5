package src.Lesson2;

public class House {

    FurnitureForLivingRoom sofa = new FurnitureForLivingRoom ("Yellow", "Big", 50);

    FurnitureForBedRoom bed = new FurnitureForBedRoom ();

    void livingRoomFurniture () {

        System.out.println("Color of sofa: " + sofa.sofaСolor);
        System.out.println("Size of sofa: " + sofa.sofaSize);
        System.out.println("Weight of sofa: " + sofa.sofaWeight);

    }


    void bedRoomFurniture () {

        bed.setSizeBed("King Size");
        bed.setColorBed("Brown");

        System.out.println("Size of bad: " + bed.getSizeBed());
        System.out.println("Color of bad: " + bed.getColorBed());

    }

}
