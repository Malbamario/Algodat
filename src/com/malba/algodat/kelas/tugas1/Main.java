package com.malba.algodat.kelas.tugas1;

public class Main {

    public static void main(String[] args) {
        // ElectricBicycle myEBicycle = new ElectricBicycle("Mario", "Blue", "IZIP");
        ElectricMotorcycle myEMotorcycle = new ElectricMotorcycle("Sam", "Red", "Vespa");
        ElectricCar myECar = new ElectricCar("Azi", "Purple", "Hyundai");

//        myEBicycle.turnLeft();
//        myEBicycle.printProperties();
//        myEBicycle.turnRight();
//        myEBicycle.printProperties();
//
//        myEMotorcycle.charge();
//        myEMotorcycle.printProperties();
//        myEMotorcycle.backward();
//        myEMotorcycle.printProperties();
//
//        myECar.turnRight();
//        myECar.printProperties();
//        myECar.breaking();
//        myECar.printProperties();

        McDonalds MCDCilinaya = new McDonalds();
        DriveThruCustomer customer1 = new DriveThruCustomer(myECar);
        DriveThruCustomer customer2 = new DriveThruCustomer(myEMotorcycle);
        MCDCilinaya.makeOrder(customer1, 1, 3);
        MCDCilinaya.makeOrder(customer2, 2, 5);
        MCDCilinaya.takeOrder();
        System.out.println(MCDCilinaya.income);
        System.out.println(MCDCilinaya.driveThruList.getOrder()+" : "+ MCDCilinaya.driveThruList.getAmount());
        MCDCilinaya.takeOrder();
        System.out.println(MCDCilinaya.income);
    }
}