package com.mycars;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private static Dealership dealership;

    private UserInterface() {

    }
    //Refer back to Workbook in order to see if these two methids are correct.
    //never heard of a privatw init
    //private constructor?
    private void init() throws IOException {
      this.dealership = DealershipFileManager.getDealership();
    }

    private static void displayVehicles (Dealership dealership) {
        for (int i = 0; i < dealership.getAllVehicles().size(); i++) {
            Vehicle myCars = dealership.getAllVehicles().get(i);
            System.out.println(myCars);
        }
        //have a parameter that contains the vehicles to list
        //create a loop
        //display the vehicles.

    }
    //TODO: Make the display
    public static void display() {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the dealership app.");
            System.out.println("Here are your options to view Vehicles: \n");
            System.out.println("1) View all vehicles\n");
            System.out.println("2) View vehicles by price.\n");
            System.out.println("3) View vehicles by make & model\n");
            System.out.println("4) View vehicles by year\n");
            System.out.println("5) View vehicles by color\n");
            System.out.println("6) View vehicles by mileage\n");
            System.out.println("7) View vehicles by car type\n");
            System.out.println("8) Add vehicles\n");
            System.out.println("9) Remove vehicles by\n");
            int userSelection = scan.nextInt();

            switch (userSelection) {
                case 1:
                    processGetAllVehiclesRequest();
                    break;
                case 2:
                    processGetByPriceRequest();
                    break;
                case 3:
                    processGetByMakeModelRequest();
                    break;
                case 4:
                    processGetByYearRequest();
                    break;
                case 5:
                    processGetByColorRequest();
                    break;
                case 6:
                    processGetByMileageRequest();
                    break;
                case 7:
                    processGetByVehicleTypeRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                default:
                    System.out.println("Sorry but that wasn't a valid selection");
            }
        }

    }

    //TODO: Complete the processes
    public static void processGetByPriceRequest() {
        ArrayList<Dealership> priceRequest = new ArrayList<>();

        for (Dealership myCars : "ArrayList for All Vehicles") {
             myCars.getVehiclesByPrice(5000,30000);
             priceRequest.add(myCars);
        }
        System.out.println(priceRequest);
    }

    public static void processGetByMakeModelRequest() {

    }
    public static void processGetByYearRequest() {

    }
    public static void processGetByColorRequest() {

    }
    public static void processGetByMileageRequest() {

    }
    public static void processGetByVehicleTypeRequest() {

    }
    public static void processGetAllVehiclesRequest() {
        //call the dealerships get all vehicles method
        dealership.getAllVehicles();
        //call the displayVehicles method
        //pass the list returned from getAllVehicles
        displayVehicles(dealership);
    }
    public static void processAddVehicleRequest() {

    }
    public static void processRemoveVehicleRequest() {

    }
}
