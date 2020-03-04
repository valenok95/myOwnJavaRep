package truckStory;

public class BridgeOfficer {
    int maxWeight;

    public BridgeOfficer (int normalValue) {
        this.maxWeight=normalValue;
    }
    public boolean checkTruck(Truck truck)
    {
        if(truck.weight>maxWeight)
        {
            System.out.println("Разворачивай грузовик, у тебя перевес " + (truck.weight-maxWeight));
            return true;
        }
        else
        {
            System.out.println("Проезжай, грузовичок!");
            return false;
        }

    }
}
