package com.mycars;

import java.io.IOException;

public class CarDealaershipApp {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("Harry's PreOwned Vehicles", "1123 NE 23ST", "123-456-7890");
        try {
            DealershipFileManager.saveDealership(dealership);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
