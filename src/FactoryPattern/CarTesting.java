package FactoryPattern;

/**
 *
 * @author Black
 */
public class CarTesting {
    
    public static void main(String[] args) {
        
        CarBuilding makeCars = new SpeedCarBuilding();
        
        Car speedCar = makeCars.orderTheCar("Speed");
        System.out.println(speedCar + "\n");
        
        Car ferrariCar = makeCars.orderTheCar("Ferrari");
        System.out.println(ferrariCar + "\n");
        
    }
}
