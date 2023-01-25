package web.model;

public class Car {
    private String model;
    private int power;
    private String color;

    public Car(String model, int power, String color) {
        this.model = model;
        this.power = power;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }
}
