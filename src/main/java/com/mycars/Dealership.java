package com.mycars;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {

    //PROPERTIES
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    //CONSTRUCTOR
    public Dealership (String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }

    //TODO: METHODS
    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max) {
        ArrayList<Vehicle> priceOrder = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            double aaa = vehicle.getPrice();
            if (aaa >= min && aaa <= max) {
                priceOrder.add(vehicle);
            }
        }
        return priceOrder;
    }
    //TODO: Make n Model
    public ArrayList<Vehicle> getVehiclesByMake(String make) {
        ArrayList<Vehicle> makeOrder = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            String vehichleMake = vehicle.getMake();
            if (vehichleMake.toUpperCase() == make.toUpperCase()) {
                makeOrder.add(vehicle);
            }
        }
        return makeOrder;
    }
    public ArrayList<Vehicle> getVehiclesByModel(String model) {
        ArrayList<Vehicle> modelOrder = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            String vehichleModel = vehicle.getModel();
            if (vehichleModel.toUpperCase() == model.toUpperCase() ) {
                modelOrder.add(vehicle);
            }
        }
        return modelOrder;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> yearOrder = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            int vehicleYear = vehicle.getYear();
            if (vehicleYear >= 1886 ) {
                yearOrder.add(vehicle);
            }
        }
        return yearOrder;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> colorOrder = new ArrayList<Vehicle>();
        for(Vehicle vehicle : this.inventory) {
           String daColor = vehicle.getColor();
           if (daColor.equals("Red") || daColor.equals("Blue") || daColor.equals("Black")) {
               colorOrder.add(vehicle);
           }
        }
        return colorOrder;

    }
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> mileageOrder = new ArrayList<>();

        for (Vehicle vehicle : this.inventory) {
            int odometer = vehicle.getOdometer();
            if (odometer >= min && odometer <= max) {
                mileageOrder.add(vehicle);
            }
        }

        return mileageOrder;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> vTypeOrder = new ArrayList<Vehicle>();

        for (Vehicle vehicle : this.inventory) {
            String veType = vehicle.getVehicleType();
            if (veType.toUpperCase() == vehicleType.toUpperCase()) {
                vTypeOrder.add(vehicle);
            }
        }

        return vTypeOrder;
    }
    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> gettyVehics = getInventory();
        return gettyVehics;
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);

    }

    public void removeVehicle(Vehicle vehicle) {
        this.inventory.remove(vehicle);

    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }
}