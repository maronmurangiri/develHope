package co.develhope.introduction;

public class HouseTester {
    public static void main(String[] args){
        House house1;
        House house2;

        house1 = new House();
        house2 = new House();
    }
}

class House{
    String address;
    int numberOfFloors;

    public House(){
        System.out.println("The house object has been created");
    }
}
