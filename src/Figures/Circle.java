package Figures;

public class Circle extends Figures {

    private int radius;

    public Circle (int radius) {
        this.radius = radius;
        setNumOfAngle(0);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
