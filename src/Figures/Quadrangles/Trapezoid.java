package Figures.Quadrangles;

public class Trapezoid extends Quadrangles {
    private int lengthOfSideA;
    private int lengthOfSideB;
    private int lengthOfHigh;

    Trapezoid (int lengthOfSideA, int lengthOfSideB, int lengthOfHigh) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
        this.lengthOfHigh = lengthOfHigh;
        setNumOfAngle(4);
    }

    @Override
    public double getArea() {
        return (lengthOfSideA + lengthOfSideB) * lengthOfHigh / 2;
    }

    public int getLengthOfHigh() {
        return lengthOfHigh;
    }

    public int getLengthOfSideA() {
        return lengthOfSideA;
    }

    public int getLengthOfSideB() {
        return lengthOfSideB;
    }

    public void setLengthOfHigh(int lengthOfHigh) {
        this.lengthOfHigh = lengthOfHigh;
    }

    public void setLengthOfSideA(int lengthOfSideA) {
        this.lengthOfSideA = lengthOfSideA;
    }

    public void setLengthOfSideB(int lengthOfSideB) {
        this.lengthOfSideB = lengthOfSideB;
    }
}
