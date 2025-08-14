public class Car {
    public String make;
    public int year;
    public int milesDriven; 
    public boolean needsOilChange; 

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
        this.milesDriven = 0; 
        this.needsOilChange = false;
    }
 public void revEngine() {
        System.out.println("VROOM!");
    }
public double ride(int miles, int speed) {
        revEngine();
        milesDriven += miles;

       
        if (milesDriven >= 5000) {
            needsOilChange = true;
        }

        return (miles / (double) speed) * 60;
    }
public boolean checkOil() {
        return needsOilChange;
    }
public void changeOil() {
        needsOilChange = false;
        milesDriven = 0;
        System.out.println("Oil changed successfully!");
    }
}
