package BuilderPattern;

/**
 *
 * @author Black
 */
public class Car implements CarPlan{
  
    private String carDoors;
    private String carWheels;
    private String carEngine;
    private String carBoonet;
    
    @Override
    public void setCarDoors(String doors) {
        this.carDoors = doors;
    }

    public String getCarDoors() {
        return carDoors;
    }

    public String getCarWheels() {
        return carWheels;
    }

    @Override
    public void setCarWheels(String carWheels) {
        this.carWheels = carWheels;
    }

    public String getCarEngine() {
        return carEngine;
    }

    @Override
    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarBoonet() {
        return carBoonet;
    }

    @Override
    public void setCarBoonet(String carBoonet) {
        this.carBoonet = carBoonet;
    }

    

}
