package FactoryPattern;

/**
 *
 * @author Black
 */
public abstract class Car {
    
    private String name;
    CWheels wheels;
    CEngine engine;
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    
    abstract void makeCar();
   
    @Override
    public String toString() {
        return "The " + name + " has a top speed of " + engine + " and wheels " + wheels;
    }   

    void displayCar() {
        System.out.println(getName() + " is on the screen.");
    }

    void folowFirstCar() {
        System.out.println(getName() + " is following first car.");
    }

    void overtakeCar() {
        System.out.println(getName() + " is first.");
    }

}
