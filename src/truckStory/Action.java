package truckStory;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class Action {

    public static void main(String[] args) {
        Truck truck1 = new Truck(20000);
        Truck truck2 = new Truck(10000);
        BridgeOfficer officer = new BridgeOfficer(15000);
        officer.checkTruck(truck1);
        officer.checkTruck(truck2);

    }
}
