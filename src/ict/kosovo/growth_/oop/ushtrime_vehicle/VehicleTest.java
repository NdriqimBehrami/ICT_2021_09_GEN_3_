package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Bicycle bicikleta1 = new Bicycle("Kuqe","Bmx",24,21);
        FishingBoat fishingboat1 = new FishingBoat("Zeze","Aura",25000,30.0,500,250000,300,"Automatike","test");
        Car4Door car4door1= new Car4Door("zeze","Mercedes",2020,20000,"Benz",3.0,4,5);
        Car car1 = new Car("Bardhe","Golf",2010,8500,"Diesel",2.0);
        Boat boat2 = new Boat("bardhe","Test",3500,15.5,45.8,325000,300);


        System.out.println(bicikleta1);
        System.out.println("----------------------------------------");
        System.out.println(fishingboat1);
        System.out.println("---------------------------------------");
        System.out.println(car4door1);
        System.out.println("---------------------------------------");
        System.out.println(car1);
        System.out.println("---------------------------------------");
        System.out.println(boat2);
    }
}
