package Builder;

/**
 *
 * @author Black
 */
public class CarEngineer {
    
    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    
    public Car getCar() {
       
        return this.carBuilder.getCar();
        
    }
    
    public void makeCar() {    
        this.carBuilder.buildCarBoonet();
        this.carBuilder.buildCarDoors();
        this.carBuilder.buildCarEngine();
        this.carBuilder.buildCarWheels();        
    }
    
}
