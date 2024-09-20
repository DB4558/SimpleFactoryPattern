package org.example;

public class VehicleStore {
    VehicleFactory vehicleFactory;
    public VehicleStore(VehicleFactory factory){
        this.vehicleFactory=factory;
    }

    public void OrderVehicle(String type){
        Vehicle vehicle;
        vehicle=vehicleFactory.createVehicle(type);
        int cost=vehicle.getCost();
        System.out.println("Cost price:"+cost);
        String speed=vehicle.getspeed();
        System.out.println("Speed is:"+speed);
    }
}
