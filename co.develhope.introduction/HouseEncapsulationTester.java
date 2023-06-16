package co.develhope.introduction;

import java.util.Scanner;

public class HouseEncapsulationTester {
    public static void main(String[] args ){

        HouseEncapsulation house;

        house = new HouseEncapsulation();

        System.out.println("Kindly input your house details in the following order : ");
        System.out.println("   House address: ");

        Scanner input = new Scanner(System.in);
        String userAddress = input.next();

        System.out.println("   House floor numbers: ");
        int userFloorNumbers = input.nextInt();

        System.out.println(" Names of House residents: ");
        String[] houseResidents = new String[]{input.next()};


        house.setAddress(userAddress);
        house.setNumberOfFloors(userFloorNumbers);
        house.setResidentsNames(houseResidents);

        System.out.println(String.format("The house address is %s",house.getAddress()));
        System.out.println(String.format("The house has %d floors",house.getNumberOfFloors()));
        System.out.println(String.format("The residents in the house include : %s",house.getResidentsNames()));
    }
}

class HouseEncapsulation{
    private String address;
    private int numberOfFloors;
    private  String[] residentsNames;

    public HouseEncapsulation(){
        System.out.println("The house object has been created");
    }

    //setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }



    //getters
    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }
}
