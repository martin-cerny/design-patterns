package Builder;

/**
 *
 * @author Black
 */
public class TestCarBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarBuilder oldStyleCar = new OldCarBuilder();
        CarEngineer carEngineer = new CarEngineer(oldStyleCar);
        
        carEngineer.makeCar();
        
        Car car = carEngineer.getCar();
        System.out.println("Car Built");
        System.out.println("Car wheels : " + car.getCarWheels());   
    }
    
}
