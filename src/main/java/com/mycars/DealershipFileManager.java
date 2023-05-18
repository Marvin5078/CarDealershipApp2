package com.mycars;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {

    //Dealership FileWriter
    public static void saveDealership(Dealership dealership) throws IOException {//probably writing to file
            FileWriter myWriter = new FileWriter("dealership.csv",true);

            myWriter.write(String.format("%s|%s|%s", dealership.getName(), dealership.getAddress(), dealership.getPhone()));
            myWriter.close();

    }

    //Dealership FileReader
    public static Dealership getDealership() throws IOException {//reckon this is reading it
        Dealership dealership = new Dealership("Harry", "123 NE 23st", "123-456-7890");

            FileReader lilReader = new FileReader("dealership.csv");
            BufferedReader myReader = new BufferedReader(lilReader);
            String line;

            while ((line = myReader.readLine()) != null) {
                String[] vehiclePieces = line.split("\\|");

                int vin = Integer.parseInt(vehiclePieces[0]);
                int year = Integer.parseInt(vehiclePieces[1]);
                String make = vehiclePieces[2];
                String model = vehiclePieces[3];
                String vehicleType = vehiclePieces[4];
                String color = vehiclePieces[5];
                int odometer = Integer.parseInt(vehiclePieces[6]);
                double price = Double.parseDouble(vehiclePieces[7]);

                Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                dealership.addVehicle(vehicle);
            }
            return dealership;
    }
}