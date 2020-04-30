import java.io.Serializable;
import java.util.Objects;

public class Car  extends Machine implements Serializable {
    public int wheels;
    public String marka;
    private String engine = "Dizel";
    public int year;


    public Car() {
    }

    public Car(int wheels, String marka, String engine, int year) {
        this.wheels = wheels;
        this.marka = marka;
        this.engine = engine;
        this.year = year;
    }

    public Car( String engine, int year) {
        super();
        this.engine = engine;
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels &&
                year == car.year &&
                Objects.equals(marka, car.marka) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, marka, engine, year);
    }

    @Override
    public String toString() {
        return "java.lviv.io.Car{" +
                "wheels=" + wheels +
                ", marka='" + marka + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                '}';
    }
}

